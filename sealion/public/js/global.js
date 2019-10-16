$(document).ready(function () {
    $("main>.nano").nanoScroller();

    $("#scrollToTop>a").click(function(event) {
        event.preventDefault();
        $("main>.nano>.nano-content").animate({
            scrollTop: $($(this).attr("href")).offset().top
        }, 1000);
    });
});

$("main .nano-content").on("scroll", function (event) {
    if ($(this).scrollTop() > 50) {
        $("#scrollToTop").addClass("open");
    } else {
        $("#scrollToTop").removeClass("open");
    }
})
