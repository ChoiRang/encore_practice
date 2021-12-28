<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	//선언부
		int count = 0;
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>hello JSP</h1>
		<h1>count = <%= count %></h1>
		<% 
		count++;
		int cnt = 0; //_jspSrevice()내부, 지역변수 생성	
		cnt++;
		%>
		<h1>count = <%= count %></h1>
		<h1>cnt = <%= cnt %></h1>
		
	</body>
</html>