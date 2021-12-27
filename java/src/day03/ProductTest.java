package day03;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();		//new = 메모리 할당
		p1.name = "블루투스 스피커";
		p1.no = 12341234;
		p1.price1 = 89000;
		System.out.println(p1.name + " 가격은 " + p1.price1 + "입니다.");
		
		Product p2 = new Product();
		p2.name = "PC 스피커";
		p2.no = 12341235;
		p2.price1 = 50000;
		System.out.println(p2.name + " 가격은 " + p2.price1 + "입니다.");
		
	}
}
