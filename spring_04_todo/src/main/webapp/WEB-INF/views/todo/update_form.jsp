<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할 일 수 정</title>
	<script type="text/javascript">
	window.onload = function(){
		
	}
	</script>
</head>
<body>
	<h1>할 일 수 정</h1>

	<div>
		<a href="list">할일 목록</a>
	</div>
	<hr>
	<form action="update_action" method="post">
		<label>
			할 일 제 목:
			<input type="text" name="title" value="${vo.title}">
			<input type="hidden" name="no" value="${vo.no}">
		</label> <br>
		<label>
			할 일 내 용:
			<input type="text" name="todo" value="${vo.todo}">
		</label> <br>
		<label>
			할 일 등 록 일:
			<input id="regdate" type="date" name="regdate" value="${vo.regdate}">
		</label> <br>
		<label>
			할 일 종 료 일:
			<input type="date" name="enddate" value="${vo.enddate}">
		</label> <br>
		
		<input type="submit" value="할 일 등 록">
	</form>


</body>
</html>


