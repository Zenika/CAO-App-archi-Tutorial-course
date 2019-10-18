package fr.adopteVaisseau.shipControl.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Facturation{

    @Id
    @GeneratedValue
    private Long id;

    private Float repairsCosts;
    private Float maintenanceCosts;
    private Long idBill;
    private Float laborCosts;
    private Float spacePartsCosts;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Control> controls;

    public Facturation() {
    }

    public Facturation(Float repairsCosts, Float maintenanceCosts, Long idBill, Float laborCosts, Float spacePartsCosts) {
        this.repairsCosts = repairsCosts;
        this.maintenanceCosts = maintenanceCosts;
        this.idBill = idBill;
        this.laborCosts = laborCosts;
        this.spacePartsCosts = spacePartsCosts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        sb.append(", repairsCosts=").append(repairsCosts);
        sb.append(", maintenanceCosts=").append(maintenanceCosts);
        sb.append(", idBill=").append(idBill);
        sb.append(", laborCosts=").append(laborCosts);
        sb.append(", spacePartsCosts=").append(spacePartsCosts);
        sb.append('}');
        return sb.toString();
    }
}
