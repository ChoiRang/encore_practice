package december_January.day06;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("김길동");
		arrList.add("박길동");
		arrList.add("이길동");
		System.out.println(arrList.size());
		System.out.println(arrList.get(0));
		arrList.remove("홍길동");		//내부적으로 equals()가 참인 객체 삭제
		
	}
}
