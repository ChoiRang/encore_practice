<%@page import="javax.swing.plaf.basic.BasicTextAreaUI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int num1, num2; //난수 2개
	String opr; // 연산자 저장
	long startTime;	//시작 시간
	long endTime;		//종료 시간
%>

<%
	startTime = System.currentTimeMillis();

	//난수 1~20사이 난수 2개 생성
	int opr_idx = (int)(Math.random()*3);
	// +, -, * 연산자중 하나 저장
	String[] oprArr = {"+", "-", "*"};
	opr = oprArr[opr_idx];
	
	num1 = (int)(Math.random()*20+1);
	if(opr_idx == 2){
		num2 = (int)(Math.random()*10+1);
	} else{
		num2 = (int)(Math.random()*20+1);
	}
	String result = "";

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>두뇌 훈련 게임</title>
		<style type="text/css">
			form > input {
				text-align: center; 
			}
		</style>
	</head>
	<body>
		<h1>두뇌 훈련 게임</h1>
		<h2>게이머 이름 : <%= application.getAttribute("nick_name")%></h2>
		<h2>시도 횟수 : <%= request.getAttribute("count")%> / <%= application.getAttribute("max_count")%></h2>
		
		<form action="">
			<input type="hidden" name="count" value="<%= application.getAttribute("count") %>">
			<input type="hidden" name="command" value="play">
			<input name="num1" value="<%= num1 %>" readonly="readonly" size="5">
			<input name="opr" value="<%= opr %>" readonly="readonly" size="5">
			<input name="num2" value="<%= num2 %>" readonly="readonly" size="5">
			 =
			<input name="answer" size="5">
			<input type="submit" value="<정답확인>">
		</form>
		
		<fieldset>
			<legend>계 &nbsp; 산 &nbsp; 결 &nbsp; 과</legend>
			<textarea rows="10" cols="50"><%= request.getAttribute("result")%></textarea>
		</fieldset>
		
	</body>
</html>