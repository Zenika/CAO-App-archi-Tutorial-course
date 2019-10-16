package cao.application.architecture.unicornrenting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int productId;
    public String nameProduct;
    public int price;
    public Boolean isRented;

    public Product(String nameProduct, int price, Boolean isRented) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + productId +
                ", name_product='" + nameProduct + '\'' +
                ", price='" + price + '\'' +
                ", is_rented='" + isRented + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) &&
                Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(price, product.price) &&
                Objects.equals(isRented, product.isRented);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, nameProduct, price, isRented);
    }

    //getter/setter

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getRented() {
        return isRented;
    }

    public void setRented(Boolean rented) {
        isRented = rented;
    }
}
