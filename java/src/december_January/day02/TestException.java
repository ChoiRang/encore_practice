package december_January.day02;

public class TestException {
	public static void main(String[] args) {
		String s = null;
		
//		가장 기본적인 오류 처리방법
//		if(s != null) {
//			System.out.println(s.length());
//		} else {
//			System.out.println("null 문자열");
		
		String s1 = "Are you ok?";
		try {
			System.out.println(s1.length());
			System.out.println(s1);
			int[] arr = new int[10];
			arr[0] = 10;
			arr[2] = 20;
			arr[10] = 100;
		} catch(NullPointerException e) {
			System.out.println(e +" 예외 발생");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

//		int[] arr = new int[10];
//		arr[0] = 10;
//		arr[2] = 20;
//		arr[10] = 100;
		
		
	}
}
