package december.day15.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberDao memberDao = new MemberDao();
	ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
	
	public void menu() {
		System.out.println("** 회원 관리**");
		System.out.println("현재 등록 회원수 : ");
		System.out.println("(1)회원 등록 (2)회원 검색 (3)회원 전체 출력 (-999)이전 메뉴");
		int menuNo = sc.nextInt();
		sc.nextLine();
		if(menuNo == 1) {
			try {
				memberDao.userInsert();
			} catch (Exception e) {
				System.out.println("유저 등록 실패");
				return;
			}
		} else if(menuNo == 2) {
			userSearch();
		} else if(menuNo == 3) {
			userAll();
		} else {
			System.out.println("1,2,3 또는 -999를 입력하세요.");
			return;
		}
	}



	private void userSearch() {
		System.out.println("**회원 검색**");
		System.out.println("(1)번호검색(수정 지원) (2)이름검색 (3)전화검색 (4)주소검색  (-999)이전메뉴");
		System.out.println("메뉴 번호 입력>>");
		int menuNo = sc.nextInt();
		sc.nextLine();
		if(menuNo == 1) {
			memberDao.findNumber();
		} else if(menuNo == 2) {
			String value = sc.nextLine();
			memberArr = memberDao.findBy("name", value);
			for(MemberVo member : memberArr) {
				System.out.println(member);
			}
		}	else if(menuNo == 3) {
			findTel();
		} else if(menuNo == 4) {
			findAddress();
		} else if(menuNo == -999) {
			return;
		} else {
			System.out.println("범위 내 숫자를 입력하세요.");
			return;
		}
	}
	
	private void userAll() {
		// TODO Auto-generated method stub
		
	}
	
}
