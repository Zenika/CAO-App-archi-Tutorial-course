package unicorn.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "productId")
	private Integer productId;
	@Column(name = "nameProduct")
	private String nameProduct;
	@Column(name = "price")
	private int price;
	@Column(name = "isRented")
	private boolean isRented;

	public Product() {
	}

	public Product(Integer productId, String nameProduct, int price, boolean isRented) {
		this.productId = productId;
		this.nameProduct = nameProduct;
		this.price = price;
		this.isRented = isRented;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
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

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

}
