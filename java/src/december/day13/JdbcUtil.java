package december.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");	//try catch �� ���� �߻������� �޼��� ȣ��ο� �׳� ���� ������
		System.out.println("Mysql dirver load complete");
		//connect whit DBMS
		String url = "jdbc:mysql://127.0.0.1/db1";
		String username = "user1";
		String password = "4321";
//		Connection con1 = DriverManager.getConnection(url, username, password);
		Connection conn = DriverManager.getConnection(url, username, password);
		
		return conn;
	}

	public static void close(Statement stmt, Connection conn){
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			}
		try {
			if(stmt != null) {
				stmt.close();	
			}
		}catch(SQLException e) {
			}
		//null �� �ƴҶ��� close ������
	}
}
