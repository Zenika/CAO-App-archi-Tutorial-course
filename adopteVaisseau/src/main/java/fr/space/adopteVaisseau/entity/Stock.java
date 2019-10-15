package fr.space.adopteVaisseau.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    private int qte;

    private String type;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employees;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Ship> ships;

    public Stock() {
    }

    public Stock(int qte, String type) {
        this.qte = qte;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stock{");
        sb.append("id=").append(id);
        sb.append(", qte=").append(qte);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
