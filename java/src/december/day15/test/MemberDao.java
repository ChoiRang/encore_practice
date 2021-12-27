package december.day15.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	Others others = new Others();
	
	public void findNumber() {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		MemberDao memDao = new MemberDao();
		System.out.println("검색할 회원 번호 입력>>");
		String findNo = sc.nextLine();
		int intFindNo = Integer.parseInt(findNo);
		try {
			memberArr = memDao.findBy("no", findNo);
			for(int i =0; i < memberArr.size(); i++) {
				if(memberArr.get(i).getNo() == intFindNo) {
					System.out.println("검색 성공");
					System.out.println(memberArr.get(i).toString());
					userChange();
				} else {
					System.out.println("없는 회원 입니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("없는 회원 입니다.");
			return;
		}
	}
	private void userChange() {
		System.out.println("회원 정보 관리하기");
		System.out.println("(1)회원수정 (2)회원삭제 (-999)이전메뉴");
		System.out.println("메뉴 번호 입력>>");
		int menuNo = sc.nextInt();
		sc.nextLine();
		if(menuNo == 1) {
			userModify();
		} else if(menuNo == 2) {
			userDelete();
		} else if(menuNo == -999) {
			return;
		}	else {
			System.out.println("범위 내 숫자를 입력하세요.");
			return;
		}
	}
	
	public void userInsert() throws Exception {
		System.out.println("회원 번호 입력>>");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.println("회원 이름 입력>>");
		String name = sc.nextLine();
		System.out.println("회원 전화 입력>>");
		String tel= sc.nextLine();
		System.out.println("회원 소개 입력>>");
		String intro = sc.nextLine();
		System.out.println("회원 주소 입력>>");
		String addr = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertSql = "insert into member(no, name, tel, intro, addr) values(?, ?, ?, ?, ?) ";
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, no);
			stmt.setString(2, name);
			stmt.setString(3, tel);
			stmt.setString(4, intro);
			stmt.setString(5, addr);
			stmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
	}

	public ArrayList<MemberVo> findBy(String column, String value) throws Exception {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		int intvalue = 0;
		boolean numberCheck = others.isNumber(value);
		String findSql = "select * from member where " + column + " like ?";
		
		if(numberCheck == true) {	//
			intvalue = Integer.parseInt(value);
		}
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(findSql);
			if(numberCheck == true) {
				stmt.setInt(1, intvalue);
			} else {
				stmt.setString(1, "%"+value+"%");
			}
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				MemberVo memberVo = new MemberVo();
				memberVo.setNo(rs.getInt(1));
				memberVo.setName(rs.getString(2));
				memberVo.setTel(rs.getString(3));
				memberVo.setIntro(rs.getString(4));
				memberVo.setAddr(rs.getString(5));
				memberArr.add(memberVo);
			}
		}	catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
	return memberArr;	
	}

	
	private void userModify() {
		// TODO Auto-generated method stub
		
	}
	
	private void userDelete() {
		// TODO Auto-generated method stub
		
	}

}
