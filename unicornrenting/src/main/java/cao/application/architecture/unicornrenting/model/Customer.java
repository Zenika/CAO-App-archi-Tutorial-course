package cao.application.architecture.unicornrenting.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int customerId;
    public String lastName;
    public String firstName;
    public String email;
    public String phoneNumber;
    public String address;
    public String postalCode;
    public String city;
    public String country;
    public Boolean paymentValidated;


    @JoinColumn(name= "staff_id", table = "staff")
    public int staffId;

    public Customer () {

    }
    public Customer(String lastName, String firstName, String email, String phoneNumber, String address,
                    String postalCode, String city, String country, Boolean paymentValidated, int staffId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.paymentValidated = paymentValidated;
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", last_name='" + lastName + '\'' +
                ", first_name='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postal_code='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", payment_validated='" + paymentValidated + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(phoneNumber, customer.phoneNumber) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(postalCode, customer.postalCode) &&
                Objects.equals(city, customer.city) &&
                Objects.equals(country, customer.country) &&
                Objects.equals(paymentValidated, customer.paymentValidated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, lastName, firstName, email, phoneNumber, address,
                postalCode, city, country, paymentValidated);
    }



    //getter/setter
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getPaymentValidated() {
        return paymentValidated;
    }

    public void setPaymentValidated(Boolean paymentValidated) {
        this.paymentValidated = paymentValidated;
    }
}
