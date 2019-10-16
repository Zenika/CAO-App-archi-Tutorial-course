<!DOCTYPE html>
<html lang="fr">

<head>
    <!-- INCLUDE HEAD-->
    @include('includes.head')
</head>
<body>
<header class="text-right">
    <!-- INCLUDE HEADER-->
    @include('includes.header')
</header>
@yield('content')

<aside class="bg-primary">
    @include('includes.menu')
</aside>

<main>
    <div class="nano">
        <div class="nano-content" id="main">
            <div>
                <span id="top"></span>
                <h1>Lorem Ipsum dolor sit amet</h1>
                <h2>Lorem Ipsum dolor sit amet</h2>
                <h3>Lorem Ipsum dolor sit amet</h3>
                <h4>Lorem Ipsum dolor sit amet</h4>
                <h5>Lorem Ipsum dolor sit amet</h5>
                <h6>Lorem Ipsum dolor sit amet</h6>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur tellus quam, varius sit amet
                    finibus vitae, feugiat sed justo. Maecenas id odio velit. Proin vel tellus purus. Sed elit lacus,
                    egestas quis mauris et, <a href="#">suscipit suscipit ex</a>. Pellentesque dignissim vulputate libero. Nullam
                    condimentum metus cursus mi rhoncus, sit amet euismod nunc egestas. Suspendisse placerat tincidunt
                    tortor ac facilisis. Cras vitae semper ex. Nulla eget ligula erat. Mauris pretium euismod neque, sit
                    amet condimentum erat pharetra vitae.</p>
                <ul>
                    <li>Lorem Ipsum dolor sit amet</li>
                    <li>
                        <ul>
                            <li>Lorem Ipsum dolor sit amet</li>
                            <li>Lorem Ipsum dolor sit amet</li>
                            <li>Lorem Ipsum dolor sit amet</li>
                        </ul></li>
                    <li>Lorem Ipsum dolor sit amet</li>
                </ul>
                <blockquote>This is a super citation</blockquote>
                <img src="https://via.placeholder.com/400x300" alt="Placeholder">
                <table>
                    <thead>
                    <tr>
                        <td>A header</td>
                        <td>A header</td>
                        <td>A header</td>
                        <td>A header</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                    </tr>
                    <tr>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                    </tr>
                    <tr>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                        <td>Lorem Ipsum dolor sit amet</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div id="scrollToTop"><a href="#top" title="Se rendre en haut de page">Top</a></div>
        </div>
    </div>
</main>

<footer>
    <!-- INCLUDE HEADER-->
    @include('includes.footer')
</footer>
</body>


<!-- INCLUDE SCRIPTS -->
@include('includes.scripts')

</html>
