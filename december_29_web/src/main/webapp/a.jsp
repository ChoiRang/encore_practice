<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>This is a.jsp</title>
	</head>
	<body>
		<h1>hello, this is a</h1>
		<h2>a = <%= request.getParameter("a") %></h2>
	</body>
</html>