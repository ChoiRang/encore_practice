package sesac.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lotto
 */
@WebServlet("/today_lotto")
public class Lotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add( (int)(Math.random()*45)+1 );
		}
		
		response.getWriter().append("<!DOCTYPE html>");
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("<title>오늘이 로또번호</title>");
		response.getWriter().append("<style>");
		response.getWriter().append("ul {list-style: none;}");
		response.getWriter().append("</style>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("<h1>오늘의 로또번호</h1>");
		response.getWriter().append("<ul>");
		ArrayList<Integer> list = new ArrayList<Integer>(lotto);
		for(Integer number : list) {
			response.getWriter().append("<li>" + number + "</li>");
		}
		response.getWriter().append("</ul>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
		
		
		response.getWriter().append(lotto.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
