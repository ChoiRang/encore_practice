package december.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.jdbc.ServerPreparedStatement;

public class TestUpdateJdbc {
	public static void main(String[] args) {
		// 5�� ������ �ּҸ� ��õ���� �����ϴ� �ڵ�
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
		String addr = "��õ";

		String insertsql = "update member set addr = ?";
		insertsql += "where no = ?";
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertsql);
			stmt.setString(1, addr);
			stmt.setInt(2, no);
			stmt.executeUpdate();
			
			
			//stmt.executeLargeUpdate();	// select 
			//stmt.executeQuery();	// DML(Insert, Update, Delete)
			
			System.out.println("add complete");
			
			
		} catch(Exception e) {
			System.out.println("sql exception");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
			//�Ѵ� �ڿ��ݳ�, �Ѵ� �ѹ��� ĳġ ������ �������� �ǳʶٴ� ������ ����.
			//SQLException �� not null ������
			//executableUpdate ���� �������� stmt.cloase ���� �ڿ��ݳ��� �ȵǼ� ������
	} 
}
