package fr.space.adopteVaisseau.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Provide a first name please")
    @Size(max = 50)
    private String firstName;

    @NotEmpty(message = "Provide a last name please")
    @Size(max = 50)
    private String lastName;

    @NotEmpty(message = "Provide adress plese")
    private String adress;

    @NotEmpty(message = "Provide a phone number please")
    @Size(max = 10)
    private String tel;

    @NotNull
    private boolean isPermissionPilot;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Location> Location;

    @NotEmpty
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Employee employees;

    public Client() {
    }

    public Client(String firstName, String lastName, String adress, String tel, boolean isPermissionPilot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.tel = tel;
        this.isPermissionPilot = isPermissionPilot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isPermissionPilot() {
        return isPermissionPilot;
    }

    public void setPermissionPilot(boolean permissionPilot) {
        isPermissionPilot = permissionPilot;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", isPermissionPilot=").append(isPermissionPilot);
        sb.append('}');
        return sb.toString();
    }
}
