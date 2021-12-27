package day06;

public class Product {
	private int no;
	private String name;
	private String factory;
	private int price;
	private int qnt;

	public Product() {}
	public Product(int no, String name, String factory, int price, int qnt) {
		this.no = no;
		this.name = name;
		this.factory = factory;
		this.price = price;
		this.qnt = qnt;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public void printInfo() {
		System.out.println("상품번호 : " + no + ", 상품이름 : " + name + ", 제조사 : " + factory +", 가격 : " + price + ", 수량 : " + qnt);
	}

}
