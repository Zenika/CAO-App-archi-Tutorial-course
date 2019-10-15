package fr.space.adopteVaisseau.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ship {

    @Id
    @GeneratedValue
    private Long id;

    private boolean isAvailable;

    private String description;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Stock stock;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Location> locations;

    public Ship() {
    }

    public Ship(boolean isAvailable, String description) {
        this.isAvailable = isAvailable;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ship{");
        sb.append("id=").append(id);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
