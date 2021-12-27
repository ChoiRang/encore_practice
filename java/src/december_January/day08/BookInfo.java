package december_January.day08;

import java.io.Serializable;

public class BookInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isbn, bookName, publisher, author; 
	private int price;
	private boolean rent = true;
	private String rentName;
	
	public BookInfo() {}
	public BookInfo(String isbn, String bookName, String publisher,
									String author, int price) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isRent() {
		return rent;
	}
	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	
	public String getRentName() {
		return rentName;
	}
	public void setRentName(String rentName) {
		this.rentName = rentName;
	}
	
	
	@Override
	public String toString() {
		return "ISBN :" + isbn + ", 도서명 : " + bookName + ", 출판사 : "+ publisher
						+ ", 작가 : " + author + ", 가격 : " + price + ", 대출가능여부 : " + isRent();
	}
	
}
