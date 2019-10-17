package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.entity.Formula;
import fr.space.adopteVaisseau.entity.Ship;

import java.util.Date;

public class LeasingDto {

    private Date startDate;

    private Date endDate;

    private boolean state;

    private Client client;

    private Ship ship;

    private Formula formula;

    public LeasingDto() {
    }

    public LeasingDto(Date startDate, Date endDate, boolean state, Client client, Ship ship, Formula formula) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
        this.client = client;
        this.ship = ship;
        this.formula = formula;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LeasingDto{");
        sb.append("startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", state=").append(state);
        sb.append(", client=").append(client);
        sb.append(", ship=").append(ship);
        sb.append(", formula=").append(formula);
        sb.append('}');
        return sb.toString();
    }
}
