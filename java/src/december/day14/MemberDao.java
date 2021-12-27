package december.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import december.day15.JdbcUtil;

// Data Access Object = Dao
public class MemberDao {
	
	/**ȸ�� ������ ���*/
	public void insert(MemberVo vo) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertsql = "insert into member(no, name, tel, intro, addr)";
		insertsql += "values(?, ?, ?, ?, ?)";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertsql);
			stmt.setInt(1, vo.getNo());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getTel());
			stmt.setString(4, vo.getIntro());
			stmt.setString(5, vo.getAddr());
			stmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);	//���� ����, ���� ����
		} finally {
			JdbcUtil.close(stmt, conn);
		}	
	}
	/** ��� ȸ�� ������ �˻�*/
	public ArrayList<MemberVo> selectAll() throws Exception {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM member ORDER BY no ASC";	
		
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
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
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return memberArr;
	}
	/**  ȸ�� ��ȣ�� ȸ�� �˻�*/
	public MemberVo findByNo(int no) throws Exception {
		MemberVo  vo = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "select * from member where no = ?";	
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);
			ResultSet rs = stmt.executeQuery();	
			if(rs.next()) {
				vo = new MemberVo();	//��ü�� �ּ� ��ȯ
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
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return vo;
	}

	/** ȸ����ȣ�� ȸ�� ���� */
	public void delete(int no) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "delete from member where no = ?";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);
			stmt.executeUpdate();
		} catch(Exception e) {	
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}
	
	public int count() throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "SELECT count(*) from member ";
		int count = 0;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch(Exception e) {
			throw new Exception(e);
		}
		return count;
	}
	
	/** column �� �˻���� <br>
	 * �÷� , ã�� �� <br>
	 * */
	public ArrayList<MemberVo> findBy(String colName, String value) throws Exception {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM member WHERE " + colName +" LIke ?";	
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, value);
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
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error 1");
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return memberArr;
	}
	
	
	public void update(MemberVo vo) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;

		String insertSql = "update member set ";
		insertSql += "name = ?,	";
		insertSql += "tel = ?,	";
		insertSql += "intro = ?,	";
		insertSql += "addr = ?	";
		insertSql += "where no = ?	";
		System.out.println("SQL : " + insertSql);
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setString(1, vo.getName());
			stmt.setString(2, vo.getTel());
			stmt.setString(3, vo.getIntro());
			stmt.setString(4, vo.getAddr());
			stmt.setInt(5, vo.getNo());
			stmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}

	
	
	
}
