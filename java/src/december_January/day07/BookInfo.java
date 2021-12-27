package december_January.day07;

public class BookInfo {
	private String bookName, author, corp, isbn;
	private int price;
	
	public BookInfo() {}

	public BookInfo(String bookName, String author, String corp, String isbn, int price) {
		this.bookName = bookName;
		this.author = author;
		this.corp = corp;
		this.isbn = isbn;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCorp() {
		return corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "도서 제목" + bookName + ", 저자 : " + author + ", 출판사 : " + corp 
						+", 국제 표준 도서 번호 : " + isbn + ", 가격 : " + price;
	}
	
}
