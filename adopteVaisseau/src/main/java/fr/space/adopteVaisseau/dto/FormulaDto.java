package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Location;

import java.util.Date;
import java.util.List;

public class FormulaDto {

    private String insurance;

    private float price;

    private Date duration;

    private List<Location> locations;

    public FormulaDto() {
    }

    public FormulaDto(String insurance, float price, Date duration, List<Location> locations) {
        this.insurance = insurance;
        this.price = price;
        this.duration = duration;
        this.locations = locations;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormulaDto{");
        sb.append("insurance='").append(insurance).append('\'');
        sb.append(", price=").append(price);
        sb.append(", duration=").append(duration);
        sb.append(", locations=").append(locations);
        sb.append('}');
        return sb.toString();
    }
}
