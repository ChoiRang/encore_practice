<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int countSuccess = 0;
int countFail = 0;
int userAnswer = 0;
int num1 = 0;
int num2 = 0;
int check = 0;
String userName = "";
String snum1 = String.valueOf(num1);
String snum2 = String.valueOf(num2);
String opr;
int answer;
%>
<%


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
		<script type="text/javascript">
				function start(){
					console.log("start!")
					<%
						try{
							userName = request.getParameter("user_name");
							userAnswer = Integer.parseInt(request.getParameter("user_answer"));
							
							num1 = (int)(Math.random()*20+1);
							num2 = (int)(Math.random()*20+1);
							check = (int)(Math.random()*3+1);
							
							switch(check){
								case 1 : opr = "+"; answer = num1 + num2; break;
								case 2 : opr = "-"; answer = num1 - num2; break;
								case 3 : opr = "*"; answer = num1 * num2; break;
							}
						for(int i = 0; i < 5; i++){
							if(answer == userAnswer){
								countSuccess++;
								num1 = (int)(Math.random()*20+1);
								num2 = (int)(Math.random()*20+1);
								check = (int)(Math.random()*3+1);
								userAnswer = -500;
							} else {
								countFail++;
								break;
							}
						}
					} catch(Exception e) {
						e.printStackTrace();
					}
					%>
				}
			window.onload = function(){
				start()
			}
		</script>
	</head>
	<body>
		<h1>사칙연산 게임</h1>
		<h3>문제 번호 : <% %></h3>
		<h3>정답 횟수 : <%= countSuccess %> / 20</h3>
		<button>게임 시작</button>
		<form action="brain_training_play.jsp"><br>
			<input name=num1 value="${snum1}">					
			<input name=opr value="${opr}">					
			<input name=num2 value="${snum2}">					
			<button type="submit" name="user_answer" onclick="start()">정답 확인</button>					
		</form>
	</body>
</html>