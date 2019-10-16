<?php

namespace App\Controller;

use App\Entity\Licorne;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Twig\Environment;

class BddController extends AbstractController {

    /**
     * @var Environment
     */
    private $twig;

    public function __construct(Environment $twig)
    {
        $this->twig = $twig;
    }

    /**
     * @Route("/data", name="data.index")
     * @return Response
     * @throws \Twig\Error\LoaderError
     * @throws \Twig\Error\RuntimeError
     * @throws \Twig\Error\SyntaxError
     */
    public function index(): Response
    {
//        $myUnicorn = new Licorne();
//        $myUnicorn->setNom('Fougueuse ballerine')
//            ->setCouleur('Dark-Mauve')
//            ->setDisponible(true)
//            ->setModele('Edition Dark turbo')
//            ->setPrix(8999,99);
//        $em = $this->getDoctrine()->getManager();
//        $em->persist($myUnicorn);
//        $em->flush();
        $repo = $this->getDoctrine()->getRepository(Licorne::class);
        dump($repo);
        return new Response($this->twig->render('pages/data.html.twig'));
    }
}