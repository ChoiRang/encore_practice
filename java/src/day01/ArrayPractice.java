package day01;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] score = new int[3];
		
		System.out.println(score);
		System.out.println(score[0]);
		
		score[0] = 900;
		
		System.out.println(score[0]);
		
		int[] scores = new int[] {90,91,92};
		System.out.println(scores);
		for(int i = 0; i< 3; i++) {
			System.out.println(scores[i]);
		}
		
		int[] score3 = new int[]{50,60,70};
	}
}
