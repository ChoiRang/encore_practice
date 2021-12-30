<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>b.jsp</title>
	</head>
	<body>
		<h1>b.jsp</h1>
		<%
			String msg = (String)request.getAttribute("msg_1");
			int count = (Integer)session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
			
		%>
		<h2>msg = <%= msg %></h2>
		<h2>msg = ${ requestScope.msg_1.length() }</h2>
		<h2>count = ${sessionScope.count }</h2>
	</body>
</html>