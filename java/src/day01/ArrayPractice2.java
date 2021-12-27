package day01;

public class ArrayPractice2 {
	public static void main(String[] args) {
		//산악동호회
		String[] names = new String[10];
		int[] ages = new int[10];
		
		System.out.println(names[0]);
		System.out.println(ages[0]);
		
		names[0] = "홍길동";
		ages[0] = 30;
		
		names[1] = "김길동";
		ages[1] = 20;
		
		System.out.println(names[0]);
		System.out.println(ages[0]);
		System.out.println(names[1]);
		System.out.println(ages[1]);
		System.out.println(names[2]);
		
	}

}
