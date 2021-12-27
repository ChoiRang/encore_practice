package day01;

public class ConditionalStatement {
	public static void main(String[] args) {
		int a = 100;
		if ( a%2 == 0 ) {
			System.out.println(a + " is Even Number");
		} else if( a%2 == 1){
			System.out.println(a + " is Odd Number");
		} else {
			System.out.println("정수 입력하세요.");
		}
		
		//학점
		int score = 90;
		if(score >= 90) {
			System.out.println("A");
		} else if(score >=80) {
			System.out.println("B");
		} else if(score >=70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		int score1 = 92;
		switch(score1) {
			case 90:
				System.out.println(score1);
				break;
			case 91:
				System.out.println(score1);
				break;
			case 92:
				System.out.println(score1);
				break;
			default:
				System.out.println("Out of lange, re input your score");
		}
		
	}	//End of main
}	//End of Class
