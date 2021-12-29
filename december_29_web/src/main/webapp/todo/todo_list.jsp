<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> todoList = (ArrayList<String>)application.getAttribute("todolist");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>to do list</title>
	</head>
	<body>
		<h1>할 일 목록</h1>
		<h2>저장 갯수 : <%= todoList.size() %></h2>
		<a href="todo.jsp?command=insert_form">할 일 등록</a><br>
		<h2>저장 갯수 : <%= todoList.size() %></h2>

	</body>
</html>