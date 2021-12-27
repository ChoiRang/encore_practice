package day06.draw;

public class Shape {
	private String color;
	private int x1;
	private int y1;

	public Shape(String color, int x1, int y1) {
		this.color = color;
		this.x1 = x1;
		this.y1 = y1;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public String getInfo() {
		return color + "," + x1 +"," + y1;
	}
}
