<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>할 일 삭 제 폼2</title>
	</head>
	<body>
		<h1>할 일 삭 제 폼2</h1>
		<div>
			<a href="todo_2">할일 목록으로 돌아가기</a>
		</div>
		<form action="todo_2_delete_action" method="post">
			할일 제목:
			<input name="title" value="${ todo.title }"><br>
			할일내용:
			<input type="text" name="todo" value="${ todo.todo }">
			<input type="hidden" name="no" value="${ param.no }">
			<br>
			<input type="submit" value="삭 제 real?">
		</form>
	</body>
</html>