package day05;

public class ProductTest {
	public static void main(String[] args) {
		int count = 0;
		int indexCheck;
		String findName;
		
		Product[] product = new Product[100];
		product[count++] = new Product("냉장고", "삼성", 100);
		product[count++] = new Product("세탁기", "LG", 110);
		product[count++] = new Product("김치냉장고", "만도", 120);
		System.out.println(count);
		for(int i = 0; i < count; i++) {
			product[i].printInfo();
		}
		System.out.println("===구분선===");
		
		findName = "김치냉장고";
		indexCheck = -1;
		int newPrice = 130;
		/** 이름으로 찾기, 가격설정 */
		for(int i = 0; i < count; i++) {
			if(product[i].getName() == findName) {
				indexCheck = i;
			} 
		}//end for
		if(indexCheck == -1) {
			System.out.println(findName + " 검색 실패");
		} else {
			System.out.println(findName + " 검색 성공");
			product[indexCheck].setPrice(newPrice);
		}
		
		for(int i = 0; i < count; i++) {
			product[i].printInfo();
		}
		System.out.println("===구분선===");
		

		findName = "세탁기";
		indexCheck = -1;	//검색 실패를 위한 위치번호 저장용
		
		for(int i = 0; i < count; i++) {
			if(product[i].getName() == findName) {
				if( i == (count-1)) {
					product[count -1] = null;
					count--;
				} else {
					product[i] = product[count -1];
					product[count -1] = null;
					indexCheck = i;
					count--;
				}
			}
		}
		if(indexCheck == -1) {
			System.out.println(findName + " 검색 실패");
		} else {
			System.out.println(findName + " 검색 성공");
		}
		//전체출력
		for(int i = 0; i < count; i++) {
			product[i].printInfo();
		}
	}
}

