<?php

namespace App\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass="App\Repository\ClientRepository")
 */
class Client
{
    /**
     * @ORM\Id()
     * @ORM\GeneratedValue()
     * @ORM\Column(type="integer")
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $Pseudo;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $LastName;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $FirstName;

    /**
     * @ORM\Column(type="datetime")
     */
    private $BirthDate;

    /**
     * @ORM\Column(type="datetime")
     */
    private $SignInDate;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $PassWord;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $Adress;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $Phone;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getPseudo(): ?string
    {
        return $this->Pseudo;
    }

    public function setPseudo(string $Pseudo): self
    {
        $this->Pseudo = $Pseudo;

        return $this;
    }

    public function getLastName(): ?string
    {
        return $this->LastName;
    }

    public function setLastName(string $LastName): self
    {
        $this->LastName = $LastName;

        return $this;
    }

    public function getFirstName(): ?string
    {
        return $this->FirstName;
    }

    public function setFirstName(string $FirstName): self
    {
        $this->FirstName = $FirstName;

        return $this;
    }

    public function getBirthDate(): ?\DateTimeInterface
    {
        return $this->BirthDate;
    }

    public function setBirthDate(\DateTimeInterface $BirthDate): self
    {
        $this->BirthDate = $BirthDate;

        return $this;
    }

    public function getSignInDate(): ?\DateTimeInterface
    {
        return $this->SignInDate;
    }

    public function setSignInDate(\DateTimeInterface $SignInDate): self
    {
        $this->SignInDate = $SignInDate;

        return $this;
    }

    public function getPassWord(): ?string
    {
        return $this->PassWord;
    }

    public function setPassWord(string $PassWord): self
    {
        $this->PassWord = $PassWord;

        return $this;
    }

    public function getAdress(): ?string
    {
        return $this->Adress;
    }

    public function setAdress(string $Adress): self
    {
        $this->Adress = $Adress;

        return $this;
    }

    public function getPhone(): ?string
    {
        return $this->Phone;
    }

    public function setPhone(string $Phone): self
    {
        $this->Phone = $Phone;

        return $this;
    }
}
