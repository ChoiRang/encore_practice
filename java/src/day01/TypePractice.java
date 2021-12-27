package day01;

public class TypePractice {
	public static void main(String[] args) {
		int money = 2000000000;				//
		long salesVolums = 30000000000L;	//그냥 숫자는 int 타입으로 인식하기때문에 long 형이라고 암시해줘야 한다.
		System.out.println(money + salesVolums);
		
		char c = 'c';
		String s1 = "dde";
		
		float f1 = 3.14f;		//double 이 기본형이다.
		
		int radius = 5;
		double PI = 3.14;
		double circleArea = radius * 2 * PI;
		System.out.println(circleArea);
	}

}
