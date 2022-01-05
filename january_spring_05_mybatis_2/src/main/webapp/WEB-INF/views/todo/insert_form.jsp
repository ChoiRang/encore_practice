<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>할 일 등록</title>
		<style type="text/css">
		#btr {
		width: 235px;
		}
		</style>
	</head>
	<body>
		<h1>할 일 등록</h1>
		<form action="insert_action" method="post">
			<label>
				제  &nbsp; 목 : 
				<input type="text" name="title"><br>
				내  &nbsp; 용 : 
				<input type="text" name="todo"><br>
				등록일 :
				<input type="date" name="regdate"><br>
				종료일 :
				<input type="date" name="enddate"><br>
				<input type="submit" id="btr" value="등록 하기">
			</label>
		</form>
		
	</body>
</html>