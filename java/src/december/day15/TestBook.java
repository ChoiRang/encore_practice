package december.day15;

import java.util.ArrayList;

public class TestBook {
	public static void main(String[] args) {
		test_insert(1302,"ÆÄÀÌ½ã ¼÷·Ã", "ÇÑºû", "ÃÖÁø", 23000);
		test_count();
		test_selcetAll();
//		test_findBy("title", "%ÀÚ¹Ù%");
		
	}

	private static void test_insert(int isbn, String title, String publisher, String author, int price) {
		BookVo bookVo = new BookVo(isbn, title, publisher, author, price);
		try {
			BookDao bookDao = new BookDao();
			bookDao.insert(bookVo);
			System.out.println("test_insert success");
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void test_count() {
		try {
			BookDao bookDao = new BookDao();
			int count = bookDao.count();
			System.out.println("book total = " + count);
		}	catch	(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void test_selcetAll() {
		BookDao bookDao = new BookDao();
		try {
			ArrayList<BookVo> bookArr = bookDao.selectAll();
			System.out.println("***ºÏ ÀüÃ¼***");
			for(BookVo book : bookArr) {
				System.out.println(book.toString());
			}
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void test_findBy(String column, String value) {
		try {
			BookDao bookDao = new BookDao();
			ArrayList<BookVo> bookArr = bookDao.findBy(column, value);
			System.out.println("***°á°ú¹° Ãâ·Â***");
			for(BookVo book : bookArr) {
				System.out.println(book);
			}
		}	catch(Exception e){
			e.printStackTrace();
			System.out.println("error 2");
		}
	}
	
}
