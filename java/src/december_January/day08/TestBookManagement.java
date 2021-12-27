package december_January.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBookManagement {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<BookInfo> bookArr = new ArrayList<BookInfo>();
	static ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();
	static BookData bookData = new BookData();
	static Management manage = new Management();
	public static void main(String[] args) {
		bookArr.addAll(bookData.bookInfoCall());	//덮어씌우기
		userArr.addAll(bookData.userInfoCall());	//덮어씌우기
		
		while(true) {
			manage.printMainMenu();
			int menuNo;
			menuNo = sc.nextInt();
			
			if(menuNo == -999) {
				System.out.println("종료되었습니다.");
				break;
			}
			manage.mainMenu(menuNo, bookArr, userArr);
		}
		
	}
}
