<ul>
    <li>
        <a href="#" id="burger-menu"><i class="material-icons">menu</i></a>
    </li>
    <li>
        <a href="#sealion" data-toggle="collapse" id="sealion-item" aria-expanded="false" >Sea Lions</a>
        <div id="sealion" aria-expanded="false" class="collapse">
            <form action="#">
                <label for="confort">Confort</label>
                <input id="confort" name="confort" type="range" min="0" max="5" step="1">
                <label for="place">Place</label>
                <input id="place" name="place" type="range" min="0" max="5" step="1">
                <label for="formule">Formule</label>
                <select name="formule" id="formule">
                    <option value="0">Silver</option>
                    <option value="1">Gold</option>
                    <option value="2">Platine</option>
                    <option value="3">Gold</option>
                </select>
            </form>
        </div>
    </li>
    <li>
        <a href="#account" id="account-item-icon"><i class="material-icons">face</i> Account</a>
        <div id="account" class="collapse" aria-expanded="false">
            <form action="#">
                <label for="">Login</label>
                <input type="text">
                <label for="">Password</label>
                <input type="password">
                <button class="btn btn-primary">Login</button>
            </form>
        </div>
    </li>
</ul>
