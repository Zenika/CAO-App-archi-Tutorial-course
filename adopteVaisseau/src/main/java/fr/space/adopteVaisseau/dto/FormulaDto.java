package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Leasing;

import java.util.Date;
import java.util.List;

public class FormulaDto {

    private String insurance;

    private float price;

    private Date duration;

    private List<Leasing> leasings;

    public FormulaDto() {
    }

    public FormulaDto(String insurance, float price, Date duration, List<Leasing> leasings) {
        this.insurance = insurance;
        this.price = price;
        this.duration = duration;
        this.leasings = leasings;
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

    public List<Leasing> getLeasings() {
        return leasings;
    }

    public void setLeasings(List<Leasing> leasings) {
        this.leasings = leasings;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormulaDto{");
        sb.append("insurance='").append(insurance).append('\'');
        sb.append(", price=").append(price);
        sb.append(", duration=").append(duration);
        sb.append(", leasings=").append(leasings);
        sb.append('}');
        return sb.toString();
    }
}
