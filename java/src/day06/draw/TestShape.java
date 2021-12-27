package day06.draw;

/**도형정보 관리 예제*/
public class TestShape {
	public static void main(String[] args) {
		Line l1 = new Line("black",3,3,9,9); // x1,y1 x2,y2 coordinate
		Circle c1 = new Circle("blue",3,4,12);	//color,x1,y1,radius
		System.out.println(l1.getInfo());
		System.out.println(c1.getInfo());

		Shape s1 = l1;
		System.out.println("s1.getInfo = " + s1.getInfo());
		
		Shape[] sarr = new Shape[1000];
		sarr[0] = l1;
		sarr[1] = c1;
		
		System.out.println("***** print all*****");
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i].getInfo());
		}
	}	
}
