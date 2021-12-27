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
		// 5번 유저의 주소를 인천으로 변경하는 코드
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
		String addr = "인천";

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
			//둘다 자원반납, 둘다 한번에 캐치 잡으면 오류날때 건너뛰는 현상이 있음.
			//SQLException 은 not null 못잡음
			//executableUpdate 에서 오류나면 stmt.cloase 에서 자원반납이 안되서 오류남
	} 
}
