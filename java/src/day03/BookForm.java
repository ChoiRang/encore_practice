package day03;

public class BookForm {
	private String bookName;
	private int price;
	private String author;
	private String company;
	
	public BookForm(String bookName, int price, String author, String company) {
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.company = company;
	}

	
	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public void printInfo() {
		System.out.println("책 이름 : "+ bookName + ", 책 가격 : "+ price + ", 작가명 : " + author + ", 출판사 : " + company);
	}
	
}
