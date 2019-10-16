<?php

namespace App\Controller;

use App\Entity\Licorne;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Routing\Annotation\Route;

class LicorneController extends AbstractController
{
    /**
     * @Route("/licorne", name="licorne")
     */
    public function index()
    {
        return $this->render('licorne/index.html.twig', [
            'controller_name' => 'LicorneController',
        ]);
    }

    /**
     * @Route("/licorne/creation", name="create_unicorn")
     */
    public function createUnicorn(): Response
    {
        // you can fetch the EntityManager via $this->getDoctrine()
        // or you can add an argument to the action: createProduct(EntityManagerInterface $entityManager)
        $entityManager = $this->getDoctrine ()->getManager ();

        $licorne = new Licorne ();
        $licorne->setNom ('Licorne simple de guerre');
        $licorne->setCouleur ('Blanche');
        $licorne->setModele ('Licorne Mk1');
        $licorne->setPrix (29.99);
        $licorne->setDisponible (true);

        // tell Doctrine you want to (eventually) save the Product (no queries yet)
        $entityManager->persist ($licorne);

        // actually executes the queries (i.e. the INSERT query)
        $entityManager->flush ();

        return new Response('Saved new product with id '.$licorne->getId ());
    }
}
