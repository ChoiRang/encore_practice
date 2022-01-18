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
		<script type="text/javascript">
		function spaceCheck(obj){
			let string_space = /\s/;
			if(string_space.exec(obj.value)){
				obj.focus()
				obj.value = obj.value.replace(' ', '')
				return false
			}
		}
		
		window.onload = function(){
			const tooltipElement = document.querySelector('.submit_tooltip')
			let bsTooltip = new bootstrap.Tooltip(tooltipElement)
		}
		</script>
		<style type="text/css">
		.warning{
			color: red;		
		}
		</style>
	</head>
	<body>
		<div class="container">
			<form method="post">
				<h1>회원 가입</h1>
				<div class="row g-2">
					<div class="col-md">
						<div class="form-floating mb-2">
							<input type="text" class="form-control" id="userid" name="id" value="${user_vo.id }" onkeyup="spaceCheck(this)" onchange="spaceCheck(this)">
							<label for="userid">아이디</label>
						</div>
					</div>
					<div class="col-md">
						<div class="form-floating" style="margin-left: 20px; margin-top: 10px;">
							<input type="submit" class="btn btn-secondary" value="중복 검사" formaction="/users/check">
							<c:if test="${confirm == 2}">
								<span class="warning">${msg}</span>
							</c:if>
							<c:if test="${confirm == 1}"><span>${check}</span>
								<input type="hidden" name="check_id" value="${checked_id}">
							</c:if><!-- success -->
							<c:if test="${confirm == 0}">
								<span class="warning">${check}</span>
							</c:if><br>
						</div>
					</div>
				</div>
				<label>비밀번호 : <input type="password" name="password" value="${user_vo.password }">
					<c:if test="${confirm == 3}"><span class="warning">${msg}</span></c:if>
				</label><br>
				<label>닉네임 : <input type="text" name="nickname" value="${user_vo.nickname }">
					<c:if test="${confirm == 4}"><span class="warning">${msg}</span></c:if>
				</label><br>
				<label>소개 : <input type="text" name="intro" value="${user_vo.intro }"></label><br>
				<label>전화번호 : <input type="text" name="tel" value="${user_vo.tel }"></label><br>
				<label>이메일 : <input type="email" name="email" placeholder="email@mail.com" value="${user_vo.email }"></label><br>
					<button 
						type="${confirm == 0? 'button' : 'submit' }"
						class="btn btn-secondary submit_tooltip"
						data-bs-placement="bottom" 
						title="${confirm == 0? '아이디 중복검사를 해주세요' : '' }" 
						formaction="/users/sign_user"
					>
						유저 등록하기
					</button>
				<button type="submit" formaction="/">돌아가기</button>					
			</form>
		</div>		
		
	</body>
</html>