package day03;

public class BookTest {
	public static void main(String[] args) {
		BookForm book1 = new BookForm("어린왕자", 20000, "생택쥐페리","회사1");
		BookForm book2 = new BookForm("노인과 바다", 20000, "헤밍웨이","회사2");

		book1.printInfo();
		book2.printInfo();

		System.out.println("책 이름 : "+ book1.getBookName() + ",책 가격 : "+ book1.getPrice());
		System.out.println("책 이름 : "+ book2.getBookName() + ",책 가격 : "+ book2.getPrice());
		
	}
}
