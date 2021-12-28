<%@page import="java.util.ArrayList"%>
<%@page import="java.util.TreeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>오늘의 로또 추천 번호</title>
	</head>
	<body>
		<h1>오늘의 로또 추천 번호</h1>
		<%
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>(lotto);
		while(lotto.size() < 6) {
			lotto.add( (int)(Math.random()*45)+1 );
		}	
		%>
		<ul>
		<% for(Integer number : list) { %>
			<li><%= number %></li>
		<% } %>
		</ul>
	</body>
</html>