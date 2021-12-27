package december_January.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {
	Scanner sc= new Scanner(System.in);
	BookData bd = new BookData();
	
	int menuNo;
	
	public void userMainMenu(ArrayList<UserInfo> userArr) {
		System.out.println("*** 유저 정보 관리 ***");
		System.out.println("(1)유저 등록 (2)유저정보 출력");
		System.out.println("메뉴 번호 입력 >>");
		menuNo = sc.nextInt();
		if(menuNo == 1) {
			addUser(userArr);
			bd.userInfoSave(userArr);
		} else if(menuNo == 2) {
			showUser(userArr);
		}
	}
	
	public void addUser(ArrayList<UserInfo> userArr) {
		sc.nextLine();
		System.out.println("*** 유저 정보 등록하기 ***");
		System.out.println("사용자 이름>>");
		String name = sc.nextLine();
		int rentBookNumber = 0;
		
		UserInfo um = new UserInfo(name, rentBookNumber);
		userArr.add(um);
	}

	private void showUser(ArrayList<UserInfo> userArr) {
		for(int i =0; i <userArr.size(); i++) {
			System.out.println(userArr.get(i).toString());
		}
	}
	
}
