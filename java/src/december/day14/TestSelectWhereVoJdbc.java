package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import december.day15.JdbcUtil;

public class TestSelectWhereVoJdbc {
	public static void main(String[] args) {
		//ȸ�� ������ 1�� ȸ���� ��� ������ ����
		MemberVo  vo = null;
		
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
				vo = new MemberVo();
				int indexNo = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String intro = rs.getString(4);
				String addr = rs.getString(5);
				vo.setNo(indexNo);
				vo.setName(name);
				vo.setTel(tel);
				vo.setIntro(intro);
				vo.setAddr(addr);
			} 
			
		} catch (ClassNotFoundException e) {
			System.out.println("Jdbc file required");
		}	catch (SQLException e) {
			System.out.println("SQL exception");
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		if(vo == null) {
			System.out.println("���ų� ������ ȸ���Դϴ�.");
		} else {
			System.out.println("�˻� ��� =");
			System.out.println(vo);
		}
		
	}
}
