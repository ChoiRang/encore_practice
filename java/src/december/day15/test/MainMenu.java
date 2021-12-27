package december.day15.test;

import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	MemberMenu memberMenu = new MemberMenu();
	BookMenu bookMenu = new BookMenu();
	
	private String version = "V0.3";
	
	
	public void printMainMenu() {
		System.out.println("*** 도서 관리 프로그램 " + version +"***");
		System.out.println("(1)회원 관리 (2)도서 관리 (-999) 종료");
		System.out.println("메뉴 번호 입력 >>");
	}
	
	public void mainMenu(int menuNo) {
		if(menuNo == 1) {
			memberMenu.menu();
		} else if(menuNo == 2) {
			bookMenu.menu();
		} else {
			System.out.println("1,2 또는 -999 를 입력하세요.");
			return;
		}
		
	}

}
