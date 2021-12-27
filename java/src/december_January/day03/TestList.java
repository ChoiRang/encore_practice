package december_January.day03;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("박효신");
		list.add("옥상달빛");
	
		System.out.println(list);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);	//Auto Boxing 으로 들어감
		intList.add(7);
		intList.add(9);
		System.out.println(intList.get(0));
		
		int sum = 0;
		for(int i=0; i <intList.size(); i++) {
			sum += intList.get(i);
		}
		
		System.out.println("sum : " +sum);
	
		sum = 0;
		for(int j : intList) {
			sum += j;
		}
		System.out.println("sum : " +sum);
	
	}
}
