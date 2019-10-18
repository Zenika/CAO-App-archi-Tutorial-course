<?php

namespace App\Controller;

use App\Entity\Annonce;
use App\Entity\Reservation;
use App\Form\AnnonceFormType;
use App\Repository\AnnonceRepository;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Annotation\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\IsGranted;

/**
 * @Route("/annonces")
 * @IsGranted("ROLE_USER")
 */
class AnnonceController extends AbstractController
{
    /**
     * @Route("/create", name="annonce_create")
     */
    public function create(Request $request)
    {

//        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');

        $annonce = new Annonce();
        $form = $this->createForm(AnnonceFormType::class, $annonce);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $date = new \DateTime();
            $annonce->setDate($date);
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
     * @Route("/{id}/edit", name="annonce_edit")
     */
    public function edit(Annonce $annonce, Request $request)
    {

//        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');

        $form = $this->createForm(AnnonceFormType::class, $annonce);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $this->getDoctrine()->getManager()->flush();

            return $this->redirectToRoute('annonces');
        }

        return $this->render('annonce/annonce_create.html.twig', [
            'createAnnonceForm' => $form->createView()
        ]);
    }

    /**
     * @Route("/", name="annonces")
     */
    public function getAnnonces(AnnonceRepository $repository)
    {

//        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');
        $annonces = $repository->findBy([
            'user' => $this->getUser()
        ]);
        if($this->isGranted('ROLE_ADMIN')) {
            $annonces = $repository->findAll();
        }


        return $this->render('annonce/annonces.html.twig', [
            'annonces' => $annonces
        ]);
    }

    /**
     * @Route("/{id}/delete", name="annonce_delete")
     */
    public function deleteAnnonce(Annonce $annonce)
    {

//        $this->denyAccessUnlessGranted('IS_AUTHENTICATED_FULLY');
        $manager = $this->getDoctrine()->getManager();
        $manager->remove($annonce);
        $manager->flush();

        return $this->redirectToRoute('annonces');
    }

    /**
     * @Route("/{id}/rent", name="annonce_rent")
     */
    public function rent(Request $request, Annonce $annonce)
    {
        $manager = $this->getDoctrine()->getManager();

        if(!$annonce->getReservation()) {
            $reservation = new Reservation();
            $reservation->setDate(new \DateTime());
            $reservation->setAnnonce($annonce);
            $reservation->setUser($this->getUser());
            $manager->persist($reservation);
            $manager->flush();
        }

        return $this->redirectToRoute('annonces');
    }
}
