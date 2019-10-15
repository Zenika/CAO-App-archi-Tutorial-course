package fr.space.adopteVaisseau.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;

    private Date startDate;

    private Date endDate;

    private boolean state;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Client client;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Ship ship;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Formula formula;

    public Location() {
    }

    public Location(Date startDate, Date endDate, boolean state) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("id=").append(id);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
