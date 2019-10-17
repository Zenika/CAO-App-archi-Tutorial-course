<?php

namespace App\Controller;

use App\Entity\TypeVehicule;
use App\Form\TypeVehiculeType;
use App\Repository\TypeVehiculeRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\IsGranted;

/**
 * @Route("/type-vehicule")
 * @IsGranted("ROLE_ADMIN")
 */
class TypeVehiculeController extends AbstractController
{
    /**
     * @Route("/", name="type_vehicule_index", methods={"GET"})
     */
    public function index(TypeVehiculeRepository $typeVehiculeRepository): Response
    {
        return $this->render('type_vehicule/index.html.twig', [
            'type_vehicules' => $typeVehiculeRepository->findAll(),
        ]);
    }

    /**
     * @Route("/create", name="type_vehicule_new", methods={"GET","POST"})
     */
    public function create(Request $request): Response
    {
        $typeVehicule = new TypeVehicule();
        $form = $this->createForm(TypeVehiculeType::class, $typeVehicule);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager = $this->getDoctrine()->getManager();
            $entityManager->persist($typeVehicule);
            $entityManager->flush();

            return $this->redirectToRoute('type_vehicule_index');
        }

        return $this->render('type_vehicule/create.html.twig', [
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}/edit", name="type_vehicule_edit", methods={"GET","POST"})
     */
    public function edit(Request $request, TypeVehicule $typeVehicule): Response
    {
        $form = $this->createForm(TypeVehiculeType::class, $typeVehicule);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $this->getDoctrine()->getManager()->flush();

            return $this->redirectToRoute('type_vehicule_index');
        }

        return $this->render('type_vehicule/edit.html.twig', [
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}/delete", name="type_vehicule_delete", methods={"GET"})
     */
    public function delete(Request $request, TypeVehicule $typeVehicule): Response
    {
        $entityManager = $this->getDoctrine()->getManager();
        $entityManager->remove($typeVehicule);
        $entityManager->flush();

        return $this->redirectToRoute('type_vehicule_index');
    }
}
