<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>할 일 등 록 폼</title>
	</head>
	<body>
		<h1>할 일 등 록 폼</h1>
		<form action="todo_insert_action" method="post">
			할 일 내용:
			<a href="todo">목록으로 돌아가기</a>
			<input name="todo"><br>
			<input type="submit" value="등록하기"><br>
		</form>
	</body>
</html>