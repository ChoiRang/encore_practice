package day03;

public class LottoMakerTest {
	public static void main(String[] args) {
		
		int i =5;
		i = 7;
		
		LottoNumbers lo1 = new LottoNumbers();	//로또번호 객체
		lo1.makeNumbers();	//로또번호 생성
		lo1.printInfo();
	}
}

