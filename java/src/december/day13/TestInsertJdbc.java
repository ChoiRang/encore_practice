package december.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.jdbc.ServerPreparedStatement;

public class TestInsertJdbc {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String username = "이길동";
		String tel = "010-114";
		String intro = "kim's 네번째";
		String addr = "부산";

		String insertsql = "insert into member(no, name, tel, intro, addr)";
		insertsql += "values(?, ?, ?, ?, ?)";
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertsql);
			stmt.setInt(1, 6);
			stmt.setString(2, username);
			stmt.setString(3, tel);
			stmt.setString(4, intro);
			stmt.setString(5, addr);
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
			//둘다 자원반납, 둘다 한번에 캐치 잡으면 오류날때 건너뛰는 현상이 있음.
			//SQLException 은 not null 못잡음
			//executableUpdate 에서 오류나면 stmt.cloase 에서 자원반납이 안되서 오류남
	} 
}
