<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
int matchNumber = (int)(Math.random()*45 + 1);
String result = "";
int count = 0;
%>
<%
String num = request.getParameter("num");
try{
	int number = Integer.parseInt(num);
		if(number > matchNumber){
			result = number + "보다 낮춰주세요. \n" + result;
			count++;					
		} else if(number < matchNumber){
			result = number + "보다 높여주세요. \n" + result;
			count++;
		} else if(number == matchNumber){
			result = number + "은 정답입니다. \n" + result;
			matchNumber = (int)(Math.random()*100 + 1);
		}
}	catch(Exception e){
	e.printStackTrace();
}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>숫자 맞추기</title>
	</head>
	<body>
		<h1>숫자 맞추기</h1>
		<h2>1~100사이 숫자를 맞춰 보세요</h2>
		<form action="number_guess.jsp">
			<input type="number" name="num" min="1" max="100">
			<input type="submit" value="정답확인">
		</form>
		<fieldset>
			<legend>확 인 결 과</legend>
			<textarea rows="10" cols="60" ><%= result %></textarea>
		</fieldset>
	</body>
</html>