package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import december.day15.JdbcUtil;

public class TestSelectWhereJdbc {
	public static void main(String[] args) {
		//ȸ�� ������ 1�� ȸ���� ��� ������ ����
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "select * from member where no = ?";	
		int no = 2;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);
			ResultSet rs = stmt.executeQuery();	
			
			if(rs.next()) {
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
			} else {
				System.out.println("deleted member");
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
//public class TestSelectWhereJdbc {
//	public static void main(String[] args) {
//		// ȸ����ȣ�� 5�� ȸ���� ��� ������ ����
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		int no = 5;
//		String sql="SELECT * FROM MEMBER WHERE no = ?";
//		try {
//			conn = JdbcUtil.getConnection();
//			stmt = conn.prepareStatement(sql);
//			stmt.setInt(1, no);
//			ResultSet rs = stmt.executeQuery();
//			if(rs.next()) {//���� ������ ����Ʈ�� �Ʒ��� ������.
//				int no2 = rs.getInt(1);
//				String name = rs.getString(2);
//				String tel = rs.getString(3);
//				String intro = rs.getString(4);
//				String addr = rs.getString(5);
//				System.out.println("no="+no2);
//				System.out.println("name="+name);
//				System.out.println("tel="+tel);
//				System.out.println("intro="+intro);
//				System.out.println("addr="+addr);
//			}else {
//				System.out.println("���ų� ������ ȸ���Դϴ�");
//			}
//		} catch (ClassNotFoundException e) {
//System.out.println("** Jdbc Driver ������ ����ϼ���! **");
//e.printStackTrace();
//} catch (SQLException e) {
//System.out.println("** SQL ó�� ���� �߻�! **");
//e.printStackTrace();
//} finally {
//JdbcUtil.close(stmt, conn);
//}
//
//}//end main
//}//end class