function putProduct()
{
    let resultStr = "";
    $.get("/produit/get/all", function (data) {
        let i = 0;
        console.log(data);
        while (i < data.length) {
           resultStr += '<div class="col l4 m6 s12" style="padding: 30px"><div class="card"><div class="card-image"><img id="idCardImg" src="client/tomato.jpg"><span id="idCardTitle" class="card-title">' + data[i].name + '</span></div><div id="idCardContent" class="card-content">';
           resultStr += "<p>" + data[i].description + "</p>";
           resultStr += '</div><label id="labelQtte" style="font-size: 15px;">Sélectionnez votre quantité</label><select class="browser-default" data-product-id="' + data[i].id + '"><option value="" disabled selected>Choose your option</option><option value="1">1 kg</option><option value="2">2 kg</option><option value="3">3 kg</option></select><div class="card-action"><a class="waves-effect waves-light btn-small btn-panier">Ajouter au Panier</a></div></div></div>';
            i++;
        }
        $("#containerCards").html(resultStr);
    })
}

function isCartValid()
{
    $.get("/user/cart/" + userId, function (data) {
        if (data.valid !== null) {
            $("#status").html("validée").addClass("valid");
        } else {
            $("#status").html("en cours")
        }
    });
}

function getMyCmd()
{
    $.get("/user/cart/" + userId, function (data) {
        let i = 0,
            finalString = "<h2>Votre panier :</h2><ul>";
        if (data !== "0") {
            while (i < data.products.length) {
                finalString += "<li><span class='quantity'>" + data.products[i].quantity + "</span><span class='product'>" + data.products[i].name + "</span></li>";
                i++;
            }
            if (data.valid === null) {
                finalString += "</ul><input type='date' id='deliver'><a class='cart-validation' href='/user/cart/" + userId + "/valid'>Valider votre panier</a>";
            } else {
                finalString += "</ul><input type='date' id='deliver'> <span class='valid'>Votre panier est validé</span>";
            }
            $("#current-command").html(finalString);
        } else {
            $("#current-command").html("Vous n'avez aucune commande en cours");
        }
    })
}

function getMyLastCmd()
{
    $.get("/user/cart/" + userId + "/history", function (data) {
        let i = 0,
            j = 0;
            finalString = "<h2>Vos anciens panier :</h2><ul>";
        if (data !== "0") {
            while (i < data.length) {
                j = 0;
                while (j < data[i].products.length) {
                    finalString += "<li><span class='quantity'>" + data[i].products[j].quantity + "</span><span class='product'>" + data[i].products[j].name + "</span></li>";
                    j++;
                }
                finalString += "</ul>";
                i++;
            }
        } else {
            finalString += "<li>Aucun ancien panier trouvé</li></ul>";
        }
        $("#history-command").html(finalString);
    })
}

//To activate burger menu on header
$(document).ready(function(){

    //To activate burger menu on header
    $('.sidenav').sidenav();

    //To calculate line bar width for title of screen
    if (window.innerWidth > 991) {
        $('.lineBar').each(function () {
            let textParentWidth = $(this).parent().width(),
                totalWidth = $(this).parent().parent().width() - (80 + textParentWidth) - 100,
                spaceTop = $(this).parent().offset().top + 3;
            $(this).width(totalWidth).css({
                "top": (spaceTop + ($(this).parent().height() / 2))
            });
        })
    }

    //to scroll to the top
    $("#scrollToTop a").on("click", function (event) {
        event.preventDefault();
        $('html, body').animate({ scrollTop: 0 }, 'fast');
    })

    $("body").on("click", ".card-action a",  function (event) {
        event.preventDefault();
        let quantity = $(this).parent().prev().children("option:selected").val(),
            product = $(this).parent().prev().attr("data-product-id");
        $.get("/produit/add/" + userId + "/" + product + "/" + quantity , function (data) {
            if (data[0] === 1) {
                M.toast({html: "Vous n'avez aucun panier en cours"});
            } else if (data[0] === 2) {
                M.toast({html: "La formule a laquelle vous avez souscrit ne peut accueillir davantage de produits"});
            }
        })
    });

    $("body").on("click", ".cart-validation", function (event) {
        event.preventDefault();
        let deliver = $(this).prev().val();
        $.get($(this).attr("href") + "/" + deliver, function (data) {
            if (data === "0") {
                M.toast({html: "Une erreur est survenue lors de la validation de votre panier"});
            } else {
                M.toast({html: "Votre panier est validé"});
                window.location.reload();
            }
        })
    })

    putProduct();
    isCartValid();
    getMyCmd();
    getMyLastCmd();
});
