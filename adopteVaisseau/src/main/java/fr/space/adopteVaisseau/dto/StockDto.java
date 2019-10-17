package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Employee;
import fr.space.adopteVaisseau.entity.Ship;

import java.util.List;

public class StockDto {

    private int qte;

    private String type;

    private List<Employee> employees;

    private List<Ship> ships;

    public StockDto() {
    }

    public StockDto(int qte, String type, List<Employee> employees, List<Ship> ships) {
        this.qte = qte;
        this.type = type;
        this.employees = employees;
        this.ships = ships;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StockDto{");
        sb.append("qte=").append(qte);
        sb.append(", type='").append(type).append('\'');
        sb.append(", employees=").append(employees);
        sb.append(", ships=").append(ships);
        sb.append('}');
        return sb.toString();
    }
}
