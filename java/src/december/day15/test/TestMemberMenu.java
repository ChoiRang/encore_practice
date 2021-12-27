package december.day15.test;

import java.util.Scanner;

public class TestMemberMenu {
		static Scanner sc = new Scanner(System.in);
		static MainMenu mainMenu = new MainMenu();
		
	public static void main(String[] args) {
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			if(menuNo == -999) {
				break;
			}
			mainMenu.printMainMenu();
			mainMenu.mainMenu(menuNo);
			
			
		}
		
		
		
		
	}
}
