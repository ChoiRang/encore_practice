package december_January.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList2 {
	public static void main(String[] args) {
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		ArrayList<Integer> arr= new ArrayList<Integer>();
//	
//		while(true) {
//			arr.add(sc.nextInt());
//			for(int i : arr) {
//				if(arr.get(i).equals(-999)) {
//					break;
//				}
//				sum += i;
//			}
//			System.out.println(sum);
//		}
//======================================================//
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	//=>여러줄읽을땐 쓰면 안됨, nextList() 는 공백도 읽음
//		int num = Integer.parseInt(sc.nextLine());
		while(true) {
			System.out.print("숫자를 입력하세요>>");
			if(num == -999) 
				break;
			arr.add(num);
		}
		int sum = 0;
		for(int i : arr)
			sum += i;
		System.out.println("총합 : " + sum);
	
	}
}
