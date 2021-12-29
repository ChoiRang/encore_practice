<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>레벨 통과</title>
	</head>
	<body>
		<div style="font-size: xx-large;">축하합니다. 레벨을 통과했습니다.<br>
			총 걸린 시간은 <%= request.getAttribute("gameTime") %>초 입니다.<br>
		<a href="brain_training.jsp">게임 다시 하기</a>	<br><br></div>
	</body>
</html>