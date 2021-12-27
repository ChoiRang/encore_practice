package december.day15.test;

import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	MemberMenu memberMenu = new MemberMenu();
	BookMenu bookMenu = new BookMenu();
	
	private String version = "V0.3";
	
	
	public void printMainMenu() {
		System.out.println("*** ���� ���� ���α׷� " + version +"***");
		System.out.println("(1)ȸ�� ���� (2)���� ���� (-999) ����");
		System.out.println("�޴� ��ȣ �Է� >>");
	}
	
	public void mainMenu(int menuNo) {
		if(menuNo == 1) {
			memberMenu.menu();
		} else if(menuNo == 2) {
			bookMenu.menu();
		} else {
			System.out.println("1,2 �Ǵ� -999 �� �Է��ϼ���.");
			return;
		}
		
	}

}
