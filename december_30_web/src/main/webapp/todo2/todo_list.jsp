<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할일 목록</title>
</head>
<body>
	<h1>할일 목록</h1>
	<a href="todo.jsp?command=insert_form">할 일 등 록</a>
	<br>
	<h2>저장갯수: ${todolist.size()} </h2>
	<h3>할일목록</h3>
	<ul>
		<c:forEach items="${todolist}" var="todo" varStatus="v">
			<li> ${ todo }
				<a href="todo.jsp?command=update_form&no=${ v.index }">수정</a> /
				<a href="todo.jsp?command=delete_action&no=${ v.index }">삭제</a>
			</li>
		</c:forEach>	
	</ul>
	
	
</body>
</html>