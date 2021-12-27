package day03;

public class MyCalcTest {
	public static void main(String[] args) {
		MyCalc mc = new MyCalc();
		mc.add(5);	//누적 기능
		mc.add(7);
		System.out.println(mc.getTotal());
		
		int r = mc.plus(5, 7);
		int r2 = mc.add(5,8);
		System.out.println(r);
		System.out.println(r2);
	}
}
