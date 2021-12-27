package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import december.day15.JdbcUtil;

public class TestSelectWhereWhileVoJdbc {
	public static void main(String[] args) {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String findName = "%%";
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
				MemberVo vo = new MemberVo();
				vo.setNo(indexNo);
				vo.setName(name);
				vo.setTel(tel);
				vo.setIntro(intro);
				vo.setAddr(addr);
				memberArr.add(vo);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Jdbc file required");
		}	catch (SQLException e) {
			System.out.println("SQL exception");
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		if(memberArr.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
		}	else {
			System.out.println("검색 결과 : " + memberArr.size() +"건 있습니다.");
			for(MemberVo vo : memberArr) {
				System.out.println(vo);
			}
		}
	}
}
