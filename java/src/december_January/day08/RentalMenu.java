package december_January.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalMenu {
	Scanner sc= new Scanner(System.in);
	
	int menuNo;
	
	public void userMainMenu(ArrayList<BookInfo> bookArr, ArrayList<UserInfo> userArr) {
		System.out.println("*** 도서 대여 관리 ***");
		System.out.println("(1)도서 대출 (2)도서 반납");
		System.out.println("메뉴 번호 입력 >>");
		menuNo = sc.nextInt();
		if(menuNo == 1) {
			bookOut(bookArr, userArr);
		} else if(menuNo == 2) {
			bookIn(bookArr, userArr);
		}
		
	}

	public void bookOut(ArrayList<BookInfo> bookArr, ArrayList<UserInfo> userArr) {
		sc.nextLine();
		System.out.println("대출할 도서 번호 입력하세요");
		String code = sc.nextLine();
		int index = -1;
		for(int i =0; i < bookArr.size(); i++) {
			if(bookArr.get(i).getIsbn().equals(code)) {
				index  = i;
				if(bookArr.get(index).isRent() == true) {
					System.out.println("대출이 가능합니다.");
				} else if(bookArr.get(index).isRent() == false) {
					System.out.println("대출된 도서입니다.");
					return;
				}	else {
					System.out.println("존재하지 않는 도서입니다.");
					return;
				}
			}
		}
		System.out.println("대출할 유저 이름을 입력하세요.");
		String name = sc.nextLine();
		for(int i =0; i < userArr.size(); i++) {
			if(userArr.get(i).getUserName().equals(name)) {
				if(userArr.get(i).getRentBookNumber() <6) {
					System.out.println("대출이 완료되었습니다.");
					bookArr.get(i).setRent(false);
					bookArr.get(i).setRentName(name);
					userArr.get(i).setRentBookNumber(+1);
				}
			} else {
				System.out.println("없는 유저 이름입니다.");
				return;
			}
		}
	}

	public void bookIn(ArrayList<BookInfo> bookArr, ArrayList<UserInfo> userArr) {
		sc.nextLine();
		System.out.println("반납할 도서 번호를 입력하세요.");
		String code = sc.nextLine();
		for(int i =0; i < bookArr.size(); i++) {
			if(bookArr.get(i).getIsbn().equals(code)) {
				for(int j =0; j <userArr.size();j++) {
					if(userArr.get(j).getUserName().equals(bookArr.get(i).getRentName())) {
						userArr.get(j).setRentBookNumber(-1);
					}
				}
				System.out.println(bookArr.get(i).getRentName() + "님, 반납이 완료되었습니다..");
				bookArr.get(i).setRentName(null);
				bookArr.get(i).setRent(true);
				return;
			} else {
				System.out.println("없는 번호입니다.");
				return;
			}
		}
	}

}
