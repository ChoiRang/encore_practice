package december.day15;

public class BookVo {
	private String title, publisher, author;
	private int isbn, price;
	
	public BookVo() {}

	public BookVo(int isbn, String title, String publisher, String author, int price) {
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "book[" + isbn + ", " + title + ", " + publisher + ", " + author + ", " + price +"]";
	}
	
	
	
}
