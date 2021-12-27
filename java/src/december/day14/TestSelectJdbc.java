package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import december.day15.JdbcUtil;

public class TestSelectJdbc {
	public static void main(String[] args) {
		//MySql jdbc driver loading and connect with MySql
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "select count(*) from member";	
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();	//ResultSet => select query only, 행 단위로 뽑아냄, 마지막 행 다음에서 false 반환후 종료
//			rs.next();	//server data pointer 가 처음에는 0행을 가르치고 있어서 다음 행 명령어로 넘겨줘야함	sql은 항상1행이 데이터 시작점임
			if(rs.next()) {
				int cnt = rs.getInt(1);
				System.out.println("행 갯수는 " + cnt);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Jdbc file required");
		}	catch (SQLException e) {
			System.out.println("SQL exception");
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		
		
		
		
	}
}
//public class TestSelectJdbc {
//	public static void main(String[] args) {
//		//MySQL jdbc driver 로딩
//		//MySQL 연결
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		String sql="SELECT count(*) FROM MEMBER";
//		try {
//			conn = JdbcUtil.getConnection();
//			stmt = conn.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
//			if(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
//				int cnt = rs.getInt(1);
//				System.out.println("행 갯수는 "+cnt);
//			}
//		} catch (ClassNotFoundException e) {
//			System.out.println("** Jdbc Driver 파일을 등록하세요! **");
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("** SQL 처리 문제 발생! **");
//			e.printStackTrace();
//		} finally {
//			JdbcUtil.close(stmt, conn);
//		}
//		
//	}//end main
//}//end class
