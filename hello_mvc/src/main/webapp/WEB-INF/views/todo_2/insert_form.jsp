<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>할 일 등 록 폼</title>
	</head>
	<body>
		<h1>할 일 등 록 폼 2</h1>
		<a href="todo_2">목록으로 돌아가기</a><br>
		<form action="todo_2_insert_action" method="post">
			할일 제목:
			<input name="title"><br>
			할일 내용:
			<input name="todo"><br>
			<input type="submit" value="등록하기"><br>
		</form>
	</body>
</html>