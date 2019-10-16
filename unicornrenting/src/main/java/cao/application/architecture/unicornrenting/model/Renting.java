package cao.application.architecture.unicornrenting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Renting {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int rentingId;
    public Date startDate;
    public Date endDate;

    public Renting(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Renting{" +
                "rentingId=" + rentingId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renting renting = (Renting) o;
        return Objects.equals(rentingId, renting.rentingId) &&
                Objects.equals(startDate, renting.startDate) &&
                Objects.equals(endDate, renting.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentingId, startDate, endDate);
    }

    //getter/setter

    public int getRentingId() {
        return rentingId;
    }

    public void setRentingId(int rentingId) {
        this.rentingId = rentingId;
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
}
