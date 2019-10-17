package fr.adopteVaisseau.shipControl.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facturation {
    @Id
    @GeneratedValue
    private Long id;

    private Float fraisReparation;
    private Float fraisEntretien;
    private Float numFacture;
    private Float fraisMainOeuvre;
    private Float fraisPiece;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Control> controls;

    public Facturation() {
    }

    public Facturation(Float fraisReparation, Float fraisEntretien, Float numFacture, Float fraisMainOeuvre, Float fraisPiece) {
        this.fraisReparation = fraisReparation;
        this.fraisEntretien = fraisEntretien;
        this.numFacture = numFacture;
        this.fraisMainOeuvre = fraisMainOeuvre;
        this.fraisPiece = fraisPiece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getFraisReparation() {
        return fraisReparation;
    }

    public void setFraisReparation(Float fraisReparation) {
        this.fraisReparation = fraisReparation;
    }

    public Float getFraisEntretien() {
        return fraisEntretien;
    }

    public void setFraisEntretien(Float fraisEntretien) {
        this.fraisEntretien = fraisEntretien;
    }

    public Float getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(Float numFacture) {
        this.numFacture = numFacture;
    }

    public Float getFraisMainOeuvre() {
        return fraisMainOeuvre;
    }

    public void setFraisMainOeuvre(Float fraisMainOeuvre) {
        this.fraisMainOeuvre = fraisMainOeuvre;
    }

    public Float getFraisPiece() {
        return fraisPiece;
    }

    public void setFraisPiece(Float fraisPiece) {
        this.fraisPiece = fraisPiece;
    }

    public List<Control> getControls() {
        return controls;
    }

    public void setControls(List<Control> controls) {
        this.controls = controls;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Facturation{");
        sb.append("id=").append(id);
        sb.append(", fraisReparation=").append(fraisReparation);
        sb.append(", fraisEntretien=").append(fraisEntretien);
        sb.append(", numFacture=").append(numFacture);
        sb.append(", fraisMainOeuvre=").append(fraisMainOeuvre);
        sb.append(", fraisPiece=").append(fraisPiece);
        sb.append('}');
        return sb.toString();
    }
}
