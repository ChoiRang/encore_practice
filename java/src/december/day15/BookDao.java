package december.day15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDao {

	public void insert(BookVo bookVo) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertSql = "insert into book(isbn, title, publisher, author, price)";
		insertSql	+= "values(?, ?, ?, ?, ?)";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, bookVo.getIsbn());
			stmt.setString(2, bookVo.getTitle());
			stmt.setString(3, bookVo.getPublisher());
			stmt.setString(4, bookVo.getAuthor());
			stmt.setInt(5, bookVo.getPrice());
			stmt.executeUpdate();
		}	catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
	}

	public int count() throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String countSql = "select count(*) from book ";
		int count = 0;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(countSql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		}	catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
		return count;
	}

	public ArrayList<BookVo> selectAll() throws Exception {
		ArrayList<BookVo> bookArr = new ArrayList<BookVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String selectSql = "select * from book order by isbn asc";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(selectSql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int isbn = rs.getInt(1);
				String title = rs.getString(2);
				String publisher = rs.getString(3);
				String author = rs.getString(4);
				int price = rs.getInt(5);
				BookVo bookVo = new BookVo();
				bookVo.setIsbn(isbn);
				bookVo.setTitle(title);
				bookVo.setPublisher(publisher);
				bookVo.setAuthor(author);
				bookVo.setPrice(price);
				bookArr.add(bookVo);
			}
		}	catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
		return bookArr;
	}

	public ArrayList<BookVo> findBy(String column, String value) throws Exception {
		ArrayList<BookVo> bookArr = new ArrayList<BookVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String findSql = "select * from book where " + column + " like ?";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(findSql);
			stmt.setString(1, value);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int isbn = rs.getInt(1);
				String title = rs.getString(2);
				String publisher = rs.getString(3);
				String author = rs.getString(4);
				int price = rs.getInt(5);
				BookVo bookVo = new BookVo();
				bookVo.setIsbn(isbn);
				bookVo.setTitle(title);
				bookVo.setPublisher(publisher);
				bookVo.setAuthor(author);
				bookVo.setPrice(price);
				bookArr.add(bookVo);
			}
		}	catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}	finally {
			JdbcUtil.close(stmt, conn);
		}
		return bookArr;
	}
	
}
