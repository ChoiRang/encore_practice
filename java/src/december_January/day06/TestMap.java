package december_January.day06;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("홍길동", 80);
		scoreMap.put("김길동", 80);
		scoreMap.put("홍길동", 90);
		
		System.out.println(scoreMap);
		//
		System.out.println("김길동의 점수 = " + scoreMap.get("김길동"));
		scoreMap.put("김길동", 100);
		System.out.println("김길동의 점수 = " + scoreMap.get("김길동"));
		// 없는 사람 호출
		System.out.println("최길동의 점수 = " + scoreMap.get("최길동"));
		
	}
}
