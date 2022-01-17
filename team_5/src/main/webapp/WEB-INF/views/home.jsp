<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>환영합니다!</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<h1>투두 리스트</h1>
			<form action="/users/login_action" method="post">
				아이디 : <input type="text" name="user_id" required="required"><br>
				비밀번호 : <input type="password" name="user_password" required="required"><br>
				<input type="submit" value="로그인">
			</form>
			<form action="/users/sign_form">
				<input type="submit" value="유저 등록하기">
			</form>
		</div>		
	</body>
</html>