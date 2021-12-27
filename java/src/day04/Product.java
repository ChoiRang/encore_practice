package day04;

public class Product {
	private String name, corp;
	private int price;
	
	public Product(String name,  int price, String corp) {
		this.name = name;
		this.price = price;
		this.corp = corp;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCorp() {
		return corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("상품명 : " + name +", 가격 : " + price + ", 제조사 : " + corp);
	}
}
