package sesac.game.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberGuess
 */
@WebServlet({ "/NumberGuess", "/number_guess" })
public class NumberGuess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//컴퓨터 난수 저장
	private int com_num = 0;
	
	@Override
	public void init() throws ServletException {
		//1~100 난수 생성후 com_num 에 저장
		com_num = (int)(Math.random()*100 + 1);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_num = request.getParameter("user_num");
		int user_n = Integer.parseInt(user_num);
		String msg = "";
		if(user_n == com_num) {
			msg = "정답입니다!";
			com_num = (int)(Math.random()*100 + 1);
		} else if(user_n < com_num) {
			msg = "보다 높여주세요";
		} else {
			msg = "보다 낮춰주세요";
		}
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
