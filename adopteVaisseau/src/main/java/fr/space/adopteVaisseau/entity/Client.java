package fr.space.adopteVaisseau.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Provide a first name please")
    @Size(max = 50)
    private String firstName;

    @NotEmpty(message = "Provide a last name please")
    @Size(max = 50)
    private String lastName;

    private String mail;

    private String adress;

    @NotEmpty(message = "Provide a phone number please")
    @Size(max = 10)
    private String tel;


    private boolean isPermissionPilot;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Leasing> Leasing;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Employee employees;

    public Client() {
    }

    public Client(@NotEmpty(message = "Provide a first name please") @Size(max = 50) String firstName, @NotEmpty(message = "Provide a last name please") @Size(max = 50) String lastName, String mail, String adress, @NotEmpty(message = "Provide a phone number please") @Size(max = 10) String tel, boolean isPermissionPilot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
