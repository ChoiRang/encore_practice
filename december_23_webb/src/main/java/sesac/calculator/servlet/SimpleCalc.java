package sesac.calculator.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet( {"/SimpleCalc","/so_simple_calc"} )
public class SimpleCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		String op = request.getParameter("opr");
		String result = "";
		
		if(op.equals("+")) {
			result += (n1 + n2);
		} else if(op.equals("-")) {
			result += (n1 - n2);
		} else if(op.equals("*")) {
			result += (n1 * n2);
		} else {
			result += (1.0*n1 / n2);
		}
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append(result+"");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
