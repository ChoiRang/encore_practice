package december.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.jdbc.ServerPreparedStatement;

public class TestDeleteJdbc {
	public static void main(String[] args) {
		// 5�� ��������
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;

		String insertsql = "delete from member where no = ?";
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertsql);
			stmt.setInt(1, no);
			stmt.executeUpdate();
			
			
			//stmt.executeLargeUpdate();	// select 
			//stmt.executeQuery();	// DML(Insert, Update, Delete)
			
			System.out.println("delete complete");
			
			
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
