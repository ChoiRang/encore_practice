package december_January.day07;

import java.io.Serializable;

public class Product implements Serializable{
	private String productCode, productName, manufacturer;
	private int price, quantity;
	
	public Product() {}
	public Product(String productCode, String productName, String ManuFacturer,
									int price, int quantity) {
		this.productName = productName;
		this.manufacturer = ManuFacturer;
		this.productCode = productCode;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "제품 코드 : "+ productCode+", 제품명 : " + productName + ", 제조사 : " + manufacturer 
				+ ", 가격 :" + price + ", 수량 : " + quantity;
	}
}
