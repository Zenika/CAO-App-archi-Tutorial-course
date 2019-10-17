package fr.adopteVaisseau.shipControl.dto;

import fr.adopteVaisseau.shipControl.entity.Control;
import java.util.List;

public class FacturationDto {

    private Float fraisReparation;
    private Float fraisEntretien;
    private Float numFacture;
    private Float fraisMainOeuvre;
    private Float fraisPiece;
    private List<Control> controls;

    public FacturationDto() {
    }

    public FacturationDto(Float fraisReparation, Float fraisEntretien, Float numFacture, Float fraisMainOeuvre, Float fraisPiece, List<Control> controls) {
        this.fraisReparation = fraisReparation;
        this.fraisEntretien = fraisEntretien;
        this.numFacture = numFacture;
        this.fraisMainOeuvre = fraisMainOeuvre;
        this.fraisPiece = fraisPiece;
        this.controls = controls;
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
        final StringBuilder sb = new StringBuilder("FacturationDto{");
        sb.append("fraisReparation=").append(fraisReparation);
        sb.append(", fraisEntretien=").append(fraisEntretien);
        sb.append(", numFacture=").append(numFacture);
        sb.append(", fraisMainOeuvre=").append(fraisMainOeuvre);
        sb.append(", fraisPiece=").append(fraisPiece);
        sb.append(", controls=").append(controls);
        sb.append('}');
        return sb.toString();
    }
}
