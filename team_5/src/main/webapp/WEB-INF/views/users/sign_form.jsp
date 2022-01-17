<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 가입</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<form method="post">
				<h1>회원 가입</h1>
				<label>아이디 : <input type="text" name="id" value="${user_vo.id }">
				</label>
				<input type="submit" value="중복 검사" formaction="/users/check">
					<c:if test="${confirm == 2}">${msg}</c:if>
					<c:if test="${confirm == 1}">${check}
						<input type="hidden" name="check_id" value="${checked_id}">
					</c:if><!-- success -->
					<c:if test="${confirm == 0}">${check}</c:if><br>
				<label>비밀번호 : <input type="password" name="password" value="${user_vo.password }">
					<c:if test="${confirm == 3}">${msg}</c:if>
				</label><br>
				<label>닉네임 : <input type="text" name="nickname" value="${user_vo.nickname }">
					<c:if test="${confirm == 4}">${msg}</c:if>
				</label><br>
				<label>소개 : <input type="text" name="intro" value="${user_vo.intro }"></label><br>
				<label>전화번호 : <input type="text" name="tel" value="${user_vo.tel }"></label><br>
				<label>이메일 : <input type="text" name="email" value="${user_vo.email }"></label><br>
					<button 
						type="${confirm == 0? 'button' : 'submit' }"
						class="btn btn-secondary submit_tooltip"
						data-bs-placement="bottom" 
						title="${confirm == 0? '아이디 중복검사를 해주세요' : '' }" 
						formaction="/users/sign_user"
					>
						유저 등록하기
					</button>						
				<input type="submit" value="돌아가기" formaction="/" >		
			</form>
		</div>		
		<script type="text/javascript">
		const tooltipElement = document.querySelector('.submit_tooltip')
		let bsTooltip = new bootstrap.Tooltip(tooltipElement)
		</script>
	</body>
</html>