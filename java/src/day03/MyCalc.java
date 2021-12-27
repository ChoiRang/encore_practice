package day03;
/** 간단한 계산기
 *  + - * \/
 * */
public class MyCalc {
	private int total = 0;	//값 고정용 변수
	
	int getTotal() {
		return total;
	}
	void add(int num) {
		total += num;
	}

	int add(int i, int j) {
		return i + j;
	}

	int plus(int i, int j) {
		int c = i + j;
		return c;
	}



}
