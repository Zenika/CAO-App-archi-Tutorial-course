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
     */
    private $id;

    /**
     * @ORM\Column(type="date")
     */
    private $LocationDate;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $EndDate;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $PaiementType;

    /**
     * @ORM\Column(type="decimal", precision=10, scale=2)
     */
    private $Amount;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getLocationDate(): ?\DateTimeInterface
    {
        return $this->LocationDate;
    }

    public function setLocationDate(\DateTimeInterface $LocationDate): self
    {
        $this->LocationDate = $LocationDate;

        return $this;
    }

    public function getEndDate(): ?string
    {
        return $this->EndDate;
    }

    public function setEndDate(string $EndDate): self
    {
        $this->EndDate = $EndDate;

        return $this;
    }

    public function getPaiementType(): ?string
    {
        return $this->PaiementType;
    }

    public function setPaiementType(string $PaiementType): self
    {
        $this->PaiementType = $PaiementType;

        return $this;
    }

    public function getAmount(): ?string
    {
        return $this->Amount;
    }

    public function setAmount(string $Amount): self
    {
        $this->Amount = $Amount;

        return $this;
    }
}
