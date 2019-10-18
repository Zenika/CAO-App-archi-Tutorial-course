<?php

namespace App\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass="App\Repository\LocationRepository")
 */
class Location
{
    /**
     * @ORM\Id()
     * @ORM\GeneratedValue()
     * @ORM\Column(type="integer")
     * @ManyToOne(targetEntity="Client", inversedBy="Location")
     * @JoinColumn(name="id", referencedColumnName="id")
     * @ManyToOne(targetEntity="Client", inversedBy="Voiture")
     * @JoinColumn(name="id", referencedColumnName="id")
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $CarPlate;

    /**
     * @ORM\Column(type="datetime")
     */
    private $RentDate;

    /**
     * @ORM\Column(type="datetime")
     */
    private $RentDateEnd;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $PaymentType;

    /**
     * @ORM\Column(type="integer")
     */
    private $Amount;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getCarPlate(): ?string
    {
        return $this->CarPlate;
    }

    public function setCarPlate(string $CarPlate): self
    {
        $this->CarPlate = $CarPlate;

        return $this;
    }

    public function getRentDate(): ?\DateTimeInterface
    {
        return $this->RentDate;
    }

    public function setRentDate(\DateTimeInterface $RentDate): self
    {
        $this->RentDate = $RentDate;

        return $this;
    }

    public function getRentDateEnd(): ?\DateTimeInterface
    {
        return $this->RentDateEnd;
    }

    public function setRentDateEnd(\DateTimeInterface $RentDateEnd): self
    {
        $this->RentDateEnd = $RentDateEnd;

        return $this;
    }

    public function getPaymentType(): ?string
    {
        return $this->PaymentType;
    }

    public function setPaymentType(string $PaymentType): self
    {
        $this->PaymentType = $PaymentType;

        return $this;
    }

    public function getAmount(): ?int
    {
        return $this->Amount;
    }

    public function setAmount(int $Amount): self
    {
        $this->Amount = $Amount;

        return $this;
    }
}
