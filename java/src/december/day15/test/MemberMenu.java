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
		System.out.println("** ȸ�� ����**");
		System.out.println("���� ��� ȸ���� : ");
		System.out.println("(1)ȸ�� ��� (2)ȸ�� �˻� (3)ȸ�� ��ü ��� (-999)���� �޴�");
		int menuNo = sc.nextInt();
		sc.nextLine();
		if(menuNo == 1) {
			try {
				memberDao.userInsert();
			} catch (Exception e) {
				System.out.println("���� ��� ����");
				return;
			}
		} else if(menuNo == 2) {
			userSearch();
		} else if(menuNo == 3) {
			userAll();
		} else {
			System.out.println("1,2,3 �Ǵ� -999�� �Է��ϼ���.");
			return;
		}
	}



	private void userSearch() {
		System.out.println("**ȸ�� �˻�**");
		System.out.println("(1)��ȣ�˻�(���� ����) (2)�̸��˻� (3)��ȭ�˻� (4)�ּҰ˻�  (-999)�����޴�");
		System.out.println("�޴� ��ȣ �Է�>>");
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
			System.out.println("���� �� ���ڸ� �Է��ϼ���.");
			return;
		}
	}
	
	private void userAll() {
		// TODO Auto-generated method stub
		
	}
	
}
