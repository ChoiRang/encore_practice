<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
// 할일 저장 변수(멤버변수)
ArrayList<String> todoList = new ArrayList<String>();
%>

<%
// todoList를 application에 "todolist"로 저장
application.setAttribute("todolist", todoList);
// command 파라미터값이 없거나 "list"이면 todo_list.jsp로 포워드
String command = request.getParameter("command");
if(command == null || command.equals("list")){
	pageContext.forward("todo_list.jsp");
}
// command 파라미터값이 "insert_form"이면 todo_insert_form.jsp로 포워드(할일등록폼)
else if(command.equals("insert_form")){
	pageContext.forward("todo_insert_form.jsp");
}
// command 파라미터값이 "insert_action"이면 
//                    todo 파라미터값을 추출하여 todoList에 저장
//                    todo.jsp로 리다이렉트
else if(command.equals("insert_action")){
	String todo = request.getParameter("todo");
	todoList.add(todo);
	response.sendRedirect("todo.jsp");
}
%>