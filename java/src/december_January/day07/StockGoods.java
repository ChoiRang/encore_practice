package december_January.day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockGoods {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> productArr = new ArrayList<Product>(); 
	
	public static void main(String[] args) {
		productInfoCall();
		
		while(true) {
			printMainMenu();
			int menuNo;
			try {
				menuNo = sc.nextInt();
				if(menuNo == -999) {
					System.out.println("종료되었습니다.");
					break;
				}
				callMainMenu(menuNo);
			} catch (InputMismatchException e) {
				sc.nextLine();	//앞이 nextInt라 무한 엔터가 되서 반복됨
				System.out.println("입력오류 : 숫자를 입력하세요.");
				//break; -> 완전종료!
			}
			
		}
	}

	private static void printMainMenu() {
		System.out.println("현재 현황 :" + productArr.size() +" 개");
		System.out.println("(1)입고 (2)전체출력 (3)판매 (-999)종료");
		System.out.print("메뉴번호 입력 >>");
	}
	
	private static void callMainMenu(int menuNo) {
		if(menuNo == 1) {
			productReceiving();
			productInfoSave();
		}	else if(menuNo == 2) {
			productPrintAll();
		}	else if(menuNo == 3) {
			productSell();
			productInfoSave();
		} else {
			System.out.println("1~3 사이 숫자를 입력하세요.");
			return;
		}
	}

	private static void productReceiving() {
		System.out.println("**가전제품 입고**");
		sc.nextLine();		//안쓰면 제품코드 넘어감?-> 앞에서 int 받아서 그럼
		System.out.println("제품 코드 : ");
		String code = sc.nextLine();
		System.out.println("제품명 : ");
		String name = sc.nextLine();
		System.out.println("제조사 : ");
		String manuFacturer = sc.nextLine();
		System.out.println("제품 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("제품 수량 : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		Product pr = new Product(code, name, manuFacturer, price, quantity);
		productArr.add(pr);
	}

	private static void productPrintAll() {
		System.out.println("**전체 출력**");
		for(int i =0; i < productArr.size(); i++) {
			System.out.println(productArr.get(i).toString());
		}
	}

	private static void productSell() {
		System.out.println("**제품 판매**");
		sc.nextLine();		//메서드가 달라고 앞에서 int 형을 입력받았기에 해당 문구를 넣어줘야함
		System.out.print("판매된 제품번호 : ");
		String code = sc.nextLine();
		int index = -1;
		for(int i = 0; i < productArr.size(); i++) {
			if(productArr.get(i).getProductCode().equals(code)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("미등록 제품번호입니다." + code);
		} else {
			System.out.print("판매 대수 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(productArr.get(index).getQuantity() >= num) {
				int total = (int)productArr.get(index).getQuantity() - num;
				productArr.get(index).setQuantity(total);
				System.out.println(productArr.get(index).getProductName() + " 제고량 : "
						+ productArr.get(index).getQuantity());
			} else {
				System.out.println("제품 남은 재고는 :" + productArr.get(index).getQuantity());
			}
		}
	}

	private static void productInfoSave() {
		try {
			FileOutputStream fos = new FileOutputStream("products.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(productArr);
			oos.flush();
			oos.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일 생성 실패");
		} catch(IOException e) {
			System.out.println("내보내기 실패");
			e.printStackTrace();
		}
	}

	private static void productInfoCall() {
		try {
			FileInputStream fis = new FileInputStream("products.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			productArr = (ArrayList<Product>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("데이터 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("추출 실패");
		}	catch(ClassNotFoundException e) {
			System.out.println("해당 배열이 없습니다.");
		}
	}
}
