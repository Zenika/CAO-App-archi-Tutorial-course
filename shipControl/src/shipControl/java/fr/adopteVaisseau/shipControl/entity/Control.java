package fr.adopteVaisseau.shipControl.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Control {

    @Id
    @GeneratedValue
    private Long id;

    private boolean moteur;
    private boolean bouclier;
    private boolean structure;
    private boolean trainAtterisage;
    private boolean armement;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Facturation facturation;

    public Control() {
    }

    public Control(boolean moteur, boolean bouclier, boolean structure, boolean trainAtterisage, boolean armement) {
        this.moteur = moteur;
        this.bouclier = bouclier;
        this.structure = structure;
        this.trainAtterisage = trainAtterisage;
        this.armement = armement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isMoteur() {
        return moteur;
    }

    public void setMoteur(boolean moteur) {
        this.moteur = moteur;
    }

    public boolean isBouclier() {
        return bouclier;
    }

    public void setBouclier(boolean bouclier) {
        this.bouclier = bouclier;
    }

    public boolean isStructure() {
        return structure;
    }

    public void setStructure(boolean structure) {
        this.structure = structure;
    }

    public boolean isTrainAtterisage() {
        return trainAtterisage;
    }

    public void setTrainAtterisage(boolean trainAtterisage) {
        this.trainAtterisage = trainAtterisage;
    }

    public boolean isArmement() {
        return armement;
    }

    public void setArmement(boolean armement) {
        this.armement = armement;
    }

    public Facturation getFacturation() {
        return facturation;
    }

    public void setFacturation(Facturation facturation) {
        this.facturation = facturation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Control{");
        sb.append("id=").append(id);
        sb.append(", moteur=").append(moteur);
        sb.append(", bouclier=").append(bouclier);
        sb.append(", structure=").append(structure);
        sb.append(", trainAtterisage=").append(trainAtterisage);
        sb.append(", armement=").append(armement);
        sb.append('}');
        return sb.toString();
    }
}
