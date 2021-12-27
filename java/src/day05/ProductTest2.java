package day05;

public class ProductTest2 {
	public static void main(String[] args) {
		//데이터 저장에 관련된 변수와 함수를 따로 클래스로 묶는다. -> XXXManager
		ProductorManager pm = new ProductorManager();	//배열 및 카운트를 포함하고 있다.
		
		Product p = new Product("냉장고", "삼성", 100);
		pm.add(p);
		p = new Product("세탁기", "LG", 110);
		pm.add(p);
		p = new Product("김치냉장고", "만도", 120);
		pm.add(p);
		
		System.out.println("저장갯수 : " + pm.getCount());
		//전체 출력하기
		System.out.println("-=전체출력=-");
		pm.printAll();
		
		//"세탁기" 찾기, 가격 130 수정
		String findName = "냉장고";
		int findIndex = pm.findByName(findName);
		pm.changePrice(130, findIndex);
		pm.printAll();
		
	}//end main
}

