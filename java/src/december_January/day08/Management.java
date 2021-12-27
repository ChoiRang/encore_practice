package december_January.day08;

import java.util.ArrayList;
import java.util.Scanner;


public class Management {
	Scanner sc= new Scanner(System.in);
	BookMenu bm = new BookMenu();
	UserMenu um = new UserMenu();
	RentalMenu rm = new RentalMenu();
	
	public void printMainMenu() {
		System.out.println("*** 도서관 도서 대여 관리 프로그램 ***");
		System.out.println("(1)도서관리 (2)회원관리 (3)대여관리 (-999)이전메뉴");
		System.out.println("메뉴번호 입력 >>");
	}

	public void mainMenu(int menuNo, ArrayList<BookInfo> bookArr, ArrayList<UserInfo> userArr) {
		if(menuNo == 1) {
			bm.bookMainMenu(bookArr);
		} else if(menuNo == 2) {
			um.userMainMenu(userArr);
		} else if(menuNo == 3) {
			rm.userMainMenu(bookArr, userArr);
		} else {
			System.out.println("1~3 사이 숫자를 입력하세요.");
			return;
		}
	}

}
