<%@page import="javax.swing.plaf.basic.BasicTextAreaUI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>오답입니다. 당신은 바보 입니까?</title>
		<style type="text/css">
			div {
			background-color: red;
			}			 
		</style>
	</head>
	<body>
		<h1>오답입니다. 당신은 바보 입니까?</h1>
		<h2>게이머 이름 : <%= application.getAttribute("nick_name")%></h2>
		<h2>시도 횟수 : <%= request.getAttribute("count")%> / <%= application.getAttribute("max_count")%></h2>
			
		<div style="font-size: xx-large;">오답입니다. 당신은 바보 입니까?</div>
		<div style="font-size: xx-large;">
			<a href="brain_training.jsp">게임 다시 시작하기</a>
		</div>
		
	</body>
</html>