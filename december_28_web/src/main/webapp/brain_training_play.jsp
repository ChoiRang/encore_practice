<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int countSuccess = 0;
int countFail = 0;
String userName = "";
int num1 = (int)(Math.random()*20+1);
int num2 = (int)(Math.random()*20+1);
int check = (int)(Math.random()*3+1);
String opr;
int answer;
%>
<%
try{
	String ans = request.getParameter("user_answer");
	int userAnswer = Integer.parseInt(ans);
	
	if(check == 1){
		opr = "+";
		answer = num1 + num2;
	} else if(check == 2){
		opr = "-";
		answer = num1 - num2;
	} else if(check == 3){
		opr = "*";
		answer = num1 * num2;
	}
	
	
	for(int i = 0; i < 5; i++){
		if(answer == userAnswer){
			countSuccess++;
		} else {
			countFail++;
		}
	}
	
} catch(Exception e) {
	e.printStackTrace();
}

%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>사칙연산 게임</title>
		<style type="text/css">
			form > input {
				width: 100px;
				font-size: 15px;
			}
		</style>
	</head>
	<body>
		<h1>사칙연산 게임</h1>
		<h3>문제 번호 : <% %></h3>
		<h3>정답 횟수 : <%= countSuccess %> / 20</h3>
		<h3>오답 횟수 : <%= countFail %> / 20</h3>
		<form action="brain_training_play.jsp">
			게이머 이름 입력:
			<input name="user_name">
			<input type="submit" value="게임 시작"><br>
			정답 맞추기 <br>
			<input name=num1 readonly="readonly" value="${num1}">					
			<input name=opr readonly="readonly" value="${opr}">					
			<input name=num2 readonly="readonly" value="${num2}">					
			<input type="number" name="user_answer" placeholder="정답입력">					
		</form>
	</body>
</html>