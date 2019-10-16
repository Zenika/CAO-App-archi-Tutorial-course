<?php

namespace App\Controller;

use App\Entity\Licorne;
use App\Repository\LicorneRepository;
use Doctrine\Common\Persistence\ObjectManager;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Twig\Environment;

class BddController extends AbstractController {

    /**
     * @var Environment
     */
    private $twig;

    /**
     * @var LicorneRepository
     */
    private $repository;
    /**
     * @var ObjectManager
     */
    private $em;

    public function __construct(LicorneRepository $repository, Environment $twig, ObjectManager $em)
    {
        $this->repository = $repository;
        $this->twig = $twig;
        $this->em = $em;
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
        $myData = $this->repository->findAll();
        $this->em->flush();
        dump($myData);
        return new Response($this->twig->render('pages/data.html.twig', [
            'allUnicorn' => $myData
        ]));
    }
}