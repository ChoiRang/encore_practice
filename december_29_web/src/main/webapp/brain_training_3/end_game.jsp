<%@page import="javax.swing.plaf.basic.BasicTextAreaUI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>축하합니다.</title>
		<style type="text/css">
			div {
			background-color: red;
			}			 
		</style>
	</head>
	<body>
		<h1>축하합니다. 모든 문제를 맞추셨습니다</h1>
		<h2>게이머 이름 : <%= application.getAttribute("nick_name")%></h2>
		<h2>시도 횟수 : <%= application.getAttribute("count")%> / <%= application.getAttribute("max_count")%></h2>
		<h3>총 걸린 시간 : </h3>
		<div style="font-size: xx-large;">
			<a href="brain_training.jsp">게임 다시 시작하기</a>
		</div>
		
	</body>
</html>