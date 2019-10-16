package cao.application.architecture.poneyhiring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Poney {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public String name;
    public String type;

    public Poney(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Poney{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
                ", lastName='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poney poney = (Poney) o;
        return Objects.equals(id, poney.id) &&
                Objects.equals(name, poney.name) &&
                Objects.equals(type, poney.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }
}
