package sesac.todo.servlet;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class TodoServlet
 */
@WebServlet( { "/todo","/main.todo" } )
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 할일 저장 변수(멤버변수)
	ArrayList<String> todoList = new ArrayList<String>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = request.getServletContext();
		
		// todoList를 application에 "todolist"로 저장
		application.setAttribute("todolist", todoList);
		// command 파라미터값이 없거나 "list"이면 todo_list.jsp로 포워드
		String command = request.getParameter("command");
		if(command == null || command.equals("list")){
			application.getRequestDispatcher("/todo2/todo_list.jsp").forward(request, response);//=====
		}
		// command 파라미터값이 "insert_form"이면 todo_insert_form.jsp로 포워드(할일등록폼)
		else if(command.equals("insert_form")){
			application.getRequestDispatcher("/todo2/todo_insert_form.jsp").forward(request, response);//=====
		}
		// command 파라미터값이 "insert_action"이면
//		                    todo 파라미터값을 추출하여 todoList에 저장
//		                    todo.jsp로 리다이렉트
		else if(command.equals("insert_action")){
			String todo = request.getParameter("todo");
			todoList.add(todo);
			response.sendRedirect("/todo2/todo.jsp");
		}else if(command.equals("update_form")){
			int no = Integer.parseInt(request.getParameter("no"));
			
			String todo = todoList.get(no);
			request.setAttribute("todo", todo);//보여줄 할일
			application.getRequestDispatcher("/todo2/todo_update_form.jsp").forward(request, response);//=====
		}else if(command.equals("update_action")){
			int no = Integer.parseInt(request.getParameter("no"));
			String todo = request.getParameter("todo");
			todoList.set(no, todo); //새로운 값으로 교체
			response.sendRedirect("/todo.jsp");
		}else if(command.equals("delete_form")){
			int no = Integer.parseInt(request.getParameter("no"));
			
			String todo = todoList.get(no);
			request.setAttribute("todo", todo);//보여줄 할일
			application.getRequestDispatcher("/todo2/todo_delete_form.jsp").forward(request, response);//=====
		}else if(command.equals("delete_action")){
			int no = Integer.parseInt(request.getParameter("no"));
			todoList.remove(no); //삭제
			response.sendRedirect("/todo2/todo.jsp");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}