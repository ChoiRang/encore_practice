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
			ResultSet rs = stmt.executeQuery();	//ResultSet => select query only, �� ������ �̾Ƴ�, ������ �� �������� false ��ȯ�� ����
//			rs.next();	//server data pointer �� ó������ 0���� ����ġ�� �־ ���� �� ��ɾ�� �Ѱ������	sql�� �׻�1���� ������ ��������
			if(rs.next()) {
				int cnt = rs.getInt(1);
				System.out.println("�� ������ " + cnt);
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
//		//MySQL jdbc driver �ε�
//		//MySQL ����
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		String sql="SELECT count(*) FROM MEMBER";
//		try {
//			conn = JdbcUtil.getConnection();
//			stmt = conn.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
//			if(rs.next()) {//���� ������ ����Ʈ�� �Ʒ��� ������.
//				int cnt = rs.getInt(1);
//				System.out.println("�� ������ "+cnt);
//			}
//		} catch (ClassNotFoundException e) {
//			System.out.println("** Jdbc Driver ������ ����ϼ���! **");
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("** SQL ó�� ���� �߻�! **");
//			e.printStackTrace();
//		} finally {
//			JdbcUtil.close(stmt, conn);
//		}
//		
//	}//end main
//}//end class
