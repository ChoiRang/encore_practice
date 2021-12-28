<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
	int com_num = -1;
	String result = "";
	int count = 0; //시도횟수
%>
<%
	if(com_num == -1){
		com_num = (int)(Math.random() * 100) + 1;
	}
	String num = request.getParameter("num");
	
	try{
		int user_num = Integer.parseInt(num);
		if(user_num < com_num){
			result = user_num + " 높혀주세요\n" + result;
			count++;
		}else if(user_num > com_num){
			result = user_num + " 낮춰주세요\n" + result;
			count++;
		}else{
			result = user_num + " 정답입니다\n" + result;
		}
		if(count == 10){
			result = "정답 : " + com_num + "\n당신은 바보입니까?";
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>숫자맞추기 jsp</title>
</head>
<body>
	<h1>숫자맞추기 jsp</h1>
	<h2>기회 : <%=count %>/10</h2>
	<h2>1~100사이 숫자를 맞춰 보세요</h2>
	<form action="">
		<input name="num">
		<input type="submit" value="정답확인">
	</form>
	<fieldset>
		<legend>확 인 결 과</legend>
		<textarea rows="10" cols="60"><%=result %></textarea><br>
			<%if(count == 10 || result.contains("정답")){%>
				<a href="number_guess.jsp">새게임 시작</a>
			<% 	count = 0;
				com_num = (int)(Math.random() * 100) + 1;
				result = "";
				}
			%>
	</fieldset>
</body>
</html>