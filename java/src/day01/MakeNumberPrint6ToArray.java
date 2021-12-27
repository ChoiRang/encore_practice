package day01;

public class MakeNumberPrint6ToArray {
	public static void main(String[] args) {
		
		int[] random = new int[6];
		
		for(int i = 0; i < random.length; i++) {
		random[i] = (int)(Math.random()*45 +1);
		System.out.println(random[i]);
		}
//		System.out.println(random);
		
		//향상된 for 문
		for(int n : random) {
			System.out.println(n);
		}
		
	}
}
