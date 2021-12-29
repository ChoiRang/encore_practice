<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int num1, num2; //난수 2개
	String opr; // 연산자 저장
	String nick_name;		//gamer name get on brain_training
	int max_count = 5;
	int count = 0;
	long startTime;	//시작 시간
	long endTime;		//종료 시간
%>

<%
	count++;


	//난수 1~20사이 난수 2개 생성
	String nick_name = request.getParameter("nick_name");
	if(nick_name != null){
		count = 1;
		this.nick_name = nick_name;
		max_count = Integer.parseInt(request.getParameter("level"));
		startTime = System.currentTimeMillis();
	} 
	
	num1 = (int)(Math.random()*20+1);
	num2 = (int)(Math.random()*20+1);
	int opr_idx = (int)(Math.random()*3); 
	String result = "";

	// +, -, * 연산자중 하나 저장
	String[] oprArr = {"+", "-", "*"};
	opr = oprArr[opr_idx];
	
	//정답 확인.
	if(count !=1){	//첫 화면인 경우 생략
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		String opr1 = request.getParameter("opr");
		int ans = Integer.parseInt(request.getParameter("answer"));
		
		if(opr1.equals("+")){
			result = ((n1 + n2) == ans? "정답입니다":"오답입니다");
		}	else if(opr1.equals("-")){
			result = ((n1 - n2) == ans? "정답입니다":"오답입니다");
		}	else if(opr1.equals("*")){
			result = ((n1 * n2) == ans? "정답입니다":"오답입니다");
		}
	}
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
		<h2>게이머 이름 : <%= nick_name %></h2>
		<h2>시도 횟수 : <%= count %> / <%= max_count %></h2>
		<%if(count > max_count) {%>
		<%	endTime  = System.currentTimeMillis();
				int gameTime = (int)(endTime - startTime)/1000;%>
		<div style="font-size: xx-large;">축하합니다. 레벨을 통과했습니다.</div><br>
		총 걸린 시간은 <%= gameTime %>초 입니다.<br>
		<a href="brain_training.jsp">게임 다시 하기</a>	<br><br>
		<%} %>
		<%if(result.contains("정답입니다") || count == 1){	%>
		<form action="">
			<input type="hidden" name="count" value="<%= count %>">
			<input name="num1" value="<%= num1 %>" readonly="readonly" size="5">
			<input name="opr" value="<%= opr %>" readonly="readonly" size="5">
			<input name="num2" value="<%= num2 %>" readonly="readonly" size="5">
			 =
			<input name="answer" size="5">
			<input type="submit" value="<정답확인>">
		</form>
		<%} else {%>
		<a href="brain_training.jsp">게임 다시 하기</a>	<br><br>
		<%} %>
		<fieldset>
			<legend>계 &nbsp; 산 &nbsp; 결 &nbsp; 과</legend>
			<textarea rows="10" cols="50"><%= result %></textarea>
		</fieldset>	
	</body>
</html>