package day04;

public class Movie {
	private String title, directorName;
	private int productCost;
	
	public Movie(String title, String directorName, int productCost) {
		this.title = title;
		this.directorName = directorName;
		this.productCost = productCost;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public void printInfo() {
		System.out.println("영화 : " + title + ", 감독 : " + directorName + ", 가격 : " + productCost);
	}
}
