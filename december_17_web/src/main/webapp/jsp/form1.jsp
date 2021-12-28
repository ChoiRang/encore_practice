<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");	//입력값 한글 나오게
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>폼 응답</title>
	</head>
	<body>
		오늘 날짜 : <%= new java.util.Date() %> <br>
		<strong>응답 :</strong>
		<%= request.getParameter("memid")%>
		<%= request.getParameter("mempw")%>	
		<%= request.getParameter("color")%>	
	</body>
</html>