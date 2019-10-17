package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Leasing;
import fr.space.adopteVaisseau.entity.Stock;

import java.util.List;

public class ShipDto {

    private boolean isAvailable;

    private String description;

    private Stock stock;

    private List<Leasing> leasings;

    public ShipDto() {
    }

    public ShipDto(boolean isAvailable, String description, Stock stock, List<Leasing> leasings) {
        this.isAvailable = isAvailable;
        this.description = description;
        this.stock = stock;
        this.leasings = leasings;
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Leasing> getLeasings() {
        return leasings;
    }

    public void setLeasings(List<Leasing> leasings) {
        this.leasings = leasings;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShipDto{");
        sb.append("isAvailable=").append(isAvailable);
        sb.append(", description='").append(description).append('\'');
        sb.append(", stock=").append(stock);
        sb.append(", leasings=").append(leasings);
        sb.append('}');
        return sb.toString();
    }
}
