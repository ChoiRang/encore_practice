<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입</title>
	<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
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
	<div class="d-flex" id="wrapper">
        <!-- Page content wrapper-->
        <div id="page-content-wrapper">
        	<!-- Page content-->
            <div class="container-fluid">
            	<h1 class="my-4">회원 가입</h1>
            	<form method="post">
            		<div class="row g-2 mb-3">
						<div class="col-md">
							<div class="form-floating mb-2">
								<input type="text" class="form-control" id="userid" name="id" value="${user_vo.id }" onkeyup="spaceCheck(this)" onchange="spaceCheck(this)">
								<label for="userid">아이디</label>
							</div>
						</div>
						<div class="col-md">
							<div class="form-floating" style="margin-left: 20px; margin-top: 10px;">
								<input type="submit" class="btn btn-secondary" value="중복 검사" formaction="${pageContext.request.contextPath}/users/check">
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
				  <div class="mb-3 form-floating">
					 <input class="form-control" type="password" id="password" name="password" value="${user_vo.password}">
						<c:if test="${confirm == 3}"><span class="warning">${msg}</span></c:if>
					 <label for="password">비밀번호 </label>
				  </div>
				  <div class="mb-3 form-floating">
				    <input class="form-control" type="text" name="nickname" value="${user_vo.nickname }">
					<c:if test="${confirm == 4}"><span class="warning">${msg}</span></c:if>
				    <label>닉네임</label>
				  </div>
				  <div class="mb-3 form-floating">
				    <input class="form-control" type="text" name="intro" value="${user_vo.intro }">
				    <label>소개</label>
				  </div>
				  <div class="mb-3 form-floating">
				    <input class="form-control" type="text" name="tel" value="${user_vo.tel }">
				    <label>전화번호</label>
				  </div>
				  <div class="mb-3 form-floating">
				    <input class="form-control" type="email" name="email" placeholder="email@mail.com" value="${user_vo.email}">
				    <label for="email">이메일</label>
				  </div>
				  <button 
						type="${confirm == 0? 'button' : 'submit' }"
						class="btn btn-secondary submit_tooltip me-2"
						data-bs-placement="bottom" 
						title="${confirm == 0? '아이디 중복검사를 해주세요' : '' }" 
						formaction="sign_user"
					>
						유저 등록하기

					</button>
				<button class="btn btn-secondary ms-2" type="submit" formaction="../">돌아가기</button>		
				</form>
				
			</div>
		</div>
	</div>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>