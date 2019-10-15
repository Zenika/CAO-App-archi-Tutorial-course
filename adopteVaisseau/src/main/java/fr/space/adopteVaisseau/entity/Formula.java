package fr.space.adopteVaisseau.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Formula {

    @Id
    @GeneratedValue
    private Long id;

    private String insurance;

    private Float price;

    private Date duration;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Location> locations;

    public Formula() {
    }

    public Formula(String insurance, Float price, Date duration) {
        this.insurance = insurance;
        this.price = price;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formula{");
        sb.append("id=").append(id);
        sb.append(", insurance='").append(insurance).append('\'');
        sb.append(", price=").append(price);
        sb.append(", duration=").append(duration);
        sb.append('}');
        return sb.toString();
    }
}
