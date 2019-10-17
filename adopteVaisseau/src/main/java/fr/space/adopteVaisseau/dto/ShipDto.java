package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Location;
import fr.space.adopteVaisseau.entity.Stock;

import java.util.List;

public class ShipDto {

    private boolean isAvailable;

    private String description;

    private Stock stock;

    private List<Location> locations;

    public ShipDto() {
    }

    public ShipDto(boolean isAvailable, String description, Stock stock, List<Location> locations) {
        this.isAvailable = isAvailable;
        this.description = description;
        this.stock = stock;
        this.locations = locations;
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

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShipDto{");
        sb.append("isAvailable=").append(isAvailable);
        sb.append(", description='").append(description).append('\'');
        sb.append(", stock=").append(stock);
        sb.append(", locations=").append(locations);
        sb.append('}');
        return sb.toString();
    }
}
