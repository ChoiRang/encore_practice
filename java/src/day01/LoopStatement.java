package day01;

public class LoopStatement {
	public static void main(String[] args) {
//		int sum = 0;
//		for(int i = 0; i <=5; i++ ) {
//			if( i%2 == 0 ) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//	
//
//		for(int i =1; i <=3; i ++) {
//			for(int y = 1; y <=3; y++) {
//				System.out.println(i + "x" + y + "=" + i*y);
//			}
//		}
//		System.out.println("=============================");
//		for(int i = 1; i <= 9; i ++) {
//			int x = 3;
//			System.out.println(x + "x" + i + "=" + (x*i));
//		}
		
		System.out.println("=============================");
		
		int dan = 3;
		while(dan < 10) {
			for(int i=1; i<10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			dan++;
		}
		
	}//End of main
}//End of Class
