package day06;

import java.util.Scanner;

public class ProductManagerTest {
	
	//키보드 입력 처리 객체 생성 static 의로 정의된 메서드는 static 변수만 소한 가능
	static Scanner sc = new Scanner(System.in);

	static Product[] parr = new Product[2000];		//값 저장용
	static int count = 0;
	
	public static void main(String[] args) {
		//무한반복
		while(true) {
			printMainMenu();//메인메뉴 츌력
			int menuNo = Integer.parseInt(sc.nextLine()); //키보드에서 숫자 읽기
			if(menuNo == 99) {
				break;	//반복 종료
			}
			if(menuNo == 1) {
				registProdct();	//상품 등록
			} else if(menuNo == 2) {
				printAll();
			}
		}
		System.out.println("---===프로그램 종료===---");
	}//end main

	private static void registProdct() {				//nextInt, nextLine 섞어서 쓰면 스킵되는 현상있음, 전부다 문자열로 받아서 숫자로 바꾸는 작업이 필요함
		System.out.println("상품 번호 입력하세요.");
		int no = Integer.parseInt(sc.nextLine());
		System.out.print("상품 이름 입력 >>");
		String name = sc.nextLine();
		System.out.print("상품 제조사 입력 >>");
		String factory = sc.nextLine();
		System.out.print("상품 가격 입력 >>");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품 수량 입력 >>");
		int qnt = Integer.parseInt(sc.nextLine());
		
		//다른 타입의 정보를 모아서 한 번에 관리하기 위해 클래스를 정의하고 객체를 만들어 저장하기
		Product p = new Product(no, name, factory, price, qnt);				//이렇게 하면 registProduct 종료후 p 가 사라지지만 p에 저장된 정보는 남아잇음, 밖에 있는 정보에 저장해야함
		parr[count++] = p;
	}//end registProduct
	/** (2) 상품목록 출력 */
	private static void printAll() {
		System.out.println("===상품번호 전체 출력===");
			for(int i = 0; i < count; i++) {
				parr[i].printInfo();
			}
	
	}
	/** 메인메뉴 출력 */
	private static void printMainMenu() {
		System.out.println("(1)상품등록 (2)상품목록 (3)상품검색-상세,수정,삭제 (99)종료");
		System.out.print("번호입력 >>");
	}
}//end class
