package day04;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] scores = new int[100];
		String[] names = new String[100];
		
		Integer li = new Integer(12);
//		System.out.println(li);
		
		int[] intArr = new int[3];
		int[][] intArr2 = new int[2][3];
//		System.out.println(intArr2[0]);
//		intArr2[0][0] = 30;
//		System.out.println(intArr2[0][0]);
//		System.out.println(intArr2[0][1]);
//		System.out.println();
//		System.out.println(intArr2[1]);
//		System.out.println(intArr2.length);
//		System.out.println(intArr2[0].length);
//		
		int[][] scores3 = {{1,3,5},{4,5,6}};
		System.out.println("=================");
		for(int i=0; i < scores3.length; i++) {
			for(int j = 0; j < scores3[i].length; j++) {
				System.out.println("intArr2["+ i +"]["+ j +"] = " + scores3[i][j]);
			}
		}//End for
		System.out.println("=================");
		
		int[] scores1 = {10, 20, 30};	//생성 및 초기화 한번에
		System.out.println(scores1[0] + scores1[1] + scores1[2]);
	
		String[] diary = new String[365];
		//January day1
		int month = 1;
		int day= 1;
		diary[(month - 1)*31 +(day-1)] = "오늘은 1월 1일";
		
		month = 11;
		day= 25;
		diary[(month - 1)*31 +(day-1)] = "오늘은 11월 25일";
		// 일기는 2차원
		String[][] diary2 = new String [12][31];
		diary2[0][0] = "오늘은 1월 1일";
		diary2[11][25] = "오늘은 11월 25일";
		
	}
}
