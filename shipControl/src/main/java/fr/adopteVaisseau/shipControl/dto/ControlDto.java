package fr.adopteVaisseau.shipControl.dto;

public class ControlDto {

    private boolean engine;
    private boolean shield;
    private boolean structure;
    private boolean landingGear;
    private boolean weaponry;

    public ControlDto() {
    }

    public ControlDto(boolean engine, boolean shield, boolean structure, boolean landingGear, boolean weaponry) {
        this.engine = engine;
        this.shield = shield;
        this.structure = structure;
        this.landingGear = landingGear;
        this.weaponry = weaponry;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ControlDto{");
        sb.append("engine=").append(engine);
        sb.append(", shield=").append(shield);
        sb.append(", structure=").append(structure);
        sb.append(", landingGear=").append(landingGear);
        sb.append(", weaponry=").append(weaponry);
        sb.append('}');
        return sb.toString();
    }
}
