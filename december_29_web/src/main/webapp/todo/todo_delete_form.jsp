<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할 일 삭 제 폼</title>
</head>
<body>
	<h1>할 일 삭 제 폼</h1>
	<div>
		<a href="todo.jsp">할일 목록으로 돌아가기</a>
	</div>
	<form action="">
		할일내용:
		<input type="text" name="todo" value="<%= request.getAttribute("todo") %>">
		<input type="hidden" name="command" value="delete_action">
		<input type="hidden" name="no" value="<%= request.getParameter("no") %>">
		<br>
		<input type="submit" value="삭 제">
	</form>
</body>
</html>