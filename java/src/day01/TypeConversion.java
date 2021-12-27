package day01;

public class TypeConversion {
	public static void main(String[] args) {
		//작은타입 -> 큰타입 ok
		//큰타입 -> 작은타입 error
		//byte < short < int < long < float < double
		
		//강제 형변환
		int i = (int)123456789123456789L;
		System.out.println(i);
		System.out.println(1 / 2);	//0이 나옴 -> 정수 끼리의 연산은 정수가 나오게 되어있다.
		System.out.println(1 / 2.0);
		
		System.out.println(1 + 2);
		System.out.println(1 + "2");
		System.out.println(1 + '2');
		System.out.println(1 + 2 + 3 +"4");
		System.out.println("===========");
		
		String s1 = "100";
		int a = 50;
		int fix = Integer.parseInt(s1);
		System.out.println(s1 + a);
		System.out.println(fix);
		System.out.println("===========");
		
		String s2 = "3.14";
		double s2fix = Double.parseDouble(s2);
		System.out.println(s2fix);
		
		// 문자열 -> 숫자
		// 숫자 -> 문자열
		int i3 = 200;
		String s3 = i3 + "";			
		
	}

}
