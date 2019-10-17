package fr.space.adopteVaisseau.dto;

import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.entity.Stock;

import java.util.List;

public class EmployeeDto {

    private String firstName;

    private String lastName;

    private String mail;

    private String password;

    private List<Client> clients;

    private Stock stock;

    public EmployeeDto(){

    }

    public EmployeeDto(String firstName, String lastName, String mail, String password, List<Client> clients, Stock stock) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.clients = clients;
        this.stock = stock;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeDto{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", clients=").append(clients);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
}
