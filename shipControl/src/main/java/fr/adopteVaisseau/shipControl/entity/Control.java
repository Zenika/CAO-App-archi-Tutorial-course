package fr.adopteVaisseau.shipControl.entity;


import javax.persistence.*;

@Entity
public class Control {

    @Id
    @GeneratedValue
    private Long id;
    private boolean engine;
    private boolean shield;
    private boolean structure;
    private boolean landingGear;
    private boolean weaponry;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Facturation facturation;

    public Control() {
    }

    public Control(boolean engine, boolean shield, boolean structure, boolean landingGear, boolean weaponry) {
        this.engine = engine;
        this.shield = shield;
        this.structure = structure;
        this.landingGear = landingGear;
        this.weaponry = weaponry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public boolean isStructure() {
        return structure;
    }

    public void setStructure(boolean structure) {
        this.structure = structure;
    }

    public boolean isLandingGear() {
        return landingGear;
    }

    public void setLandingGear(boolean landingGear) {
        this.landingGear = landingGear;
    }

    public boolean isWeaponry() {
        return weaponry;
    }

    public void setWeaponry(boolean weaponry) {
        this.weaponry = weaponry;
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
        sb.append(", engine=").append(engine);
        sb.append(", shield=").append(shield);
        sb.append(", structure=").append(structure);
        sb.append(", landingGear=").append(landingGear);
        sb.append(", weaponry=").append(weaponry);
        sb.append('}');
        return sb.toString();
    }
}
