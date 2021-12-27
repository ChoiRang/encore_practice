package day05;
/** Product 배열과 count 변수를 보호하는 클래스*/
public class ProductorManager {
	private Product[] parr = new Product[100];
	private int count = 0;
	
	public int getCount() {
		return count;
	}
	
	public void add(Product p) {
		parr[count++] = p;
	}

	/** !이름으로 검색하기! 해당 번호를 반환하기 */
	public int findByName(String name) {
		for(int i = 0; i < count; i++) {
			if(parr[i].getName() == name) {
				System.out.println(name + " 검색 성공");
				return i;	//해당 위치 반환후 종료하기
			}
		}
		System.out.println(name + " 검색 실패");
		return -1;	//이름 못 찾을때
	}//end findByName

	/** 전체 배열 출력 */
	public void printAll() {
		for(int i = 0; i <count; i++) {
			parr[i].printInfo();
		}
	}

	public void changePrice(int price, int findIndex) {
		parr[findIndex].setPrice(price);
	}


}