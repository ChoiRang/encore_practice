package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import december.day15.JdbcUtil;

public class TestSelectWhereWhileJdbc {
	public static void main(String[] args) {
		//회원 이름인 길동이 포함된 목록을 출력하기
		Connection conn = null;
		PreparedStatement stmt = null;
//		String sql = "select * from member where name like '%길동'";
		String findName = "%길동%";
		String sql = "SELECT * FROM member WHERE name LIKE ? ORDER BY no DESC";	
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, findName);
			ResultSet rs = stmt.executeQuery();	
			
			while(rs.next()) {
				int indexNo = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String intro = rs.getString(4);
				String addr = rs.getString(5);
				System.out.println("no = " + indexNo);
				System.out.println("name = " + name);
				System.out.println("tel = " + tel);
				System.out.println("intro = " + intro);
				System.out.println("addr = " + addr);
				System.out.println();
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
