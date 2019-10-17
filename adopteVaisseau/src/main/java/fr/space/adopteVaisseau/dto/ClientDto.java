package fr.space.adopteVaisseau.dto;

public class ClientDto {

    private String firstName;

    private String lastName;

    private String mail;

    private String adress;

    private String tel;

    private boolean isPermissionPilot;

    public ClientDto() {
    }

    public ClientDto(String firstName, String lastName, String mail, String adress, String tel, boolean isPermissionPilot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.adress = adress;
        this.tel = tel;
        this.isPermissionPilot = isPermissionPilot;
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
        final StringBuilder sb = new StringBuilder("ClientDto{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", isPermissionPilot=").append(isPermissionPilot);
        sb.append('}');
        return sb.toString();
    }
}
