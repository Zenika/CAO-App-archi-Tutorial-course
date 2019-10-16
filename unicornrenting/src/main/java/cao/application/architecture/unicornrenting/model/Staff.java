package cao.application.architecture.unicornrenting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int staffId;
    public String lastName;
    public String firstName;
    public String login;
    public String email;
    public String password;

    public Staff(String lastName, String firstName, String login, String email, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staffId +
                ", last_name='" + lastName + '\'' +
                ", first_name='" + firstName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffId, staff.staffId) &&
                Objects.equals(lastName, staff.lastName) &&
                Objects.equals(firstName, staff.firstName) &&
                Objects.equals(login, staff.login) &&
                Objects.equals(email, staff.email) &&
                Objects.equals(password, staff.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, lastName, firstName, login, email, password);
    }

    //getter/setter

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
