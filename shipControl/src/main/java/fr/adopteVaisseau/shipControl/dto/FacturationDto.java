package fr.adopteVaisseau.shipControl.dto;

public class FacturationDto {

    private Float repairsCosts;
    private Float maintenanceCosts;
    private Long idBill;
    private Float laborCosts;
    private Float spacePartsCosts;

    public FacturationDto() {
    }

    public FacturationDto(Float repairsCosts, Float maintenanceCosts, Long idBill, Float laborCosts, Float spacePartsCosts) {
        this.repairsCosts = repairsCosts;
        this.maintenanceCosts = maintenanceCosts;
        this.idBill = idBill;
        this.laborCosts = laborCosts;
        this.spacePartsCosts = spacePartsCosts;
    }

    public Float getRepairsCosts() {
        return repairsCosts;
    }

    public void setRepairsCosts(Float repairsCosts) {
        this.repairsCosts = repairsCosts;
    }

    public Float getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(Float maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public Long getIdBill() {
        return idBill;
    }

    public void setIdBill(Long idBill) {
        this.idBill = idBill;
    }

    public Float getLaborCosts() {
        return laborCosts;
    }

    public void setLaborCosts(Float laborCosts) {
        this.laborCosts = laborCosts;
    }

    public Float getSpacePartsCosts() {
        return spacePartsCosts;
    }

    public void setSpacePartsCosts(Float spacePartsCosts) {
        this.spacePartsCosts = spacePartsCosts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FacturationDto{");
        sb.append("repairsCosts=").append(repairsCosts);
        sb.append(", maintenanceCosts=").append(maintenanceCosts);
        sb.append(", idBill=").append(idBill);
        sb.append(", laborCosts=").append(laborCosts);
        sb.append(", spacePartsCosts=").append(spacePartsCosts);
        sb.append('}');
        return sb.toString();
    }
}
