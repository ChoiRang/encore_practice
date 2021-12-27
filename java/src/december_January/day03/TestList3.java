package december_January.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList3 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("이름 입력, 종료는 끝");
			String name = sc.nextLine();
			if(name.equals("끝"))
				break;
			arr.add(name);
		}
		while(true) {
			System.out.println("1=총 회원수 출력,2=성씨 찾기,3=종료");
//			int index = Integer.parseInt(sc.nextLine());
			int index = sc.nextInt();
			
//			index = sc.nextInt();
			if(index == 1) {
				System.out.println(arr.size() +"명!");
			} else if (index == 2) {
				System.out.println("성씨 입력하세요.(맨 앞글자만 인식함)");
				System.out.println("idx ::: " + index);
				sc = new Scanner(System.in);
				String findName = sc.nextLine();
				System.out.println("fn ::: " + findName);
				char firstname = findName.charAt(0);
				for(String s : arr) {
					if(s.charAt(0) == firstname)
						count++;
				}	System.out.println(firstname +"씨는 총 " + count +"명 입니다.");
			}	else if (sc.nextInt() ==3)
				break;
		}
	}
}
