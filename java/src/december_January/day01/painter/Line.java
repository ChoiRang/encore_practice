package december_January.day01.painter;
/** 선 : 두 점 사이*/
public class Line extends Shape{

	private int x2;
	private int y2;

	public Line(String color, int x1, int y1, int x2, int y2) {
		super(color, x1, y1);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + ","+ x2 + "," + y2;
	}

	@Override
	public void draw() {
		System.out.println("선그리기");
	}
	
	
}
