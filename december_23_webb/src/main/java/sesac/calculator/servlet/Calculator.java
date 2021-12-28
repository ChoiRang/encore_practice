package sesac.calculator.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet({"/Calculator", "/calc"})
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int left = 0;
	private int right = 0;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String leftPar = request.getParameter("left");
		String rightPar = request.getParameter("right");
		String opr = request.getParameter("operator");
		
		left = Integer.parseInt(leftPar);
		right = Integer.parseInt(rightPar);
		String answer = "";
		int result = 0;
		
		if(opr.equals("+")) {
			answer += (left + right);	//String 형으로
		}
		
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append(answer);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
