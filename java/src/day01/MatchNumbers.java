package day01;

import java.util.Scanner;

public class MatchNumbers {

	public static void main(String[] args) {
		//저장된 1~100 사이 컴퓨터 난수를 맞춰보기
		//컴퓨터가 임의의 숫자를 저장 하고 사용자가 값을 제시한다.
		//컴퓨터가 계산하여 "높여주세요","낮춰주세요","정답입니다"를 출력하게 하자
		//System.out.println("1~100 사이 값을 입력하세요.");
		
		//random = random * 100 //0.0~ 99.999
		//int intRandom = (int)random;	//0~99
		//intRandom = intRandom + 1;
		int random = (int)(Math.random()*100 +1); // 0~99 -> 1~100
		Scanner sc = new Scanner(System.in);
		System.out.println(random);
		//int input = sc.nextInt();		//키보드에서 얻은 입력 숫자를 input 에 저장
		
		while(true) {
			System.out.println("1~100 사이 값을 입력하세요.");
			int input = sc.nextInt();
			
			if(input > random) {
				System.out.println("낮혀주세요.");
			} else if(input < random){
				System.out.println("높여주세요.");
			} else if(input == random){
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("범위 밖입니다.");
			}
		}	System.out.println("종료 완료");
		
	}
}
