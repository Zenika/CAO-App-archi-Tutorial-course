<?php

namespace App\Controller;

use App\Entity\Annonce;
use App\Form\AnnonceFormType;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Annotation\Route;

class AnnonceController extends AbstractController
{
    /**
     * @Route("/annonce/create", name="annonce_create")
     */
    public function create(Request $request)
    {

        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');

        $annonce = new Annonce();
        $form = $this->createForm(AnnonceFormType::class, $annonce);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $date = new \DateTime();
            $annonce->setDate($date);
            $annonce->setIsRented(0);
            $annonce->setUser($this->getUser());

            $entityManager = $this->getDoctrine()->getManager();
            $entityManager->persist($annonce);
            $entityManager->flush();

            return $this->redirectToRoute('annonces');
        }

        return $this->render('annonce/annonce_create.html.twig', [
            'createAnnonceForm' => $form->createView()
        ]);
    }

    /**
     * @Route("/annonce/{id}/edit", name="annonce_edit")
     */
    public function edit(Annonce $annonce, Request $request)
    {

        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');

        $form = $this->createForm(AnnonceFormType::class, $annonce);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager = $this->getDoctrine()->getManager();
            $entityManager->persist($annonce);
            $entityManager->flush();

            return $this->redirectToRoute('annonces');
        }

        return $this->render('annonce/annonce_create.html.twig', [
            'createAnnonceForm' => $form->createView()
        ]);
    }

    /**
     * @Route("/annonces", name="annonces")
     */
    public function getAnnonces()
    {

        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');

        $annonces = $this->getDoctrine()
            ->getRepository(Annonce::class)
            ->findBy([
               'user' =>  $this->getUser()
            ]);

        return $this->render('annonce/annonces.html.twig', [
            'annonces' => $annonces
        ]);
    }

    /**
     * @Route("/annonce/{id}/delete", name="annonce_delete")
     */
    public function deleteAnnonce($id)
    {

        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');
        $manager = $this->getDoctrine()->getManager();

        $annonce = $this->getDoctrine()
            ->getRepository(Annonce::class)
            ->find($id);
        $manager->remove($annonce);
        $manager->flush();

        return $this->redirectToRoute('annonces');
    }
}
