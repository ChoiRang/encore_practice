<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
	<style type="text/css">
	.wrong{
		color:red;
	}
	</style>
</head>
<body>
	<div class="d-flex" id="wrapper">
        <!-- Page content wrapper-->
        <div id="page-content-wrapper">
        	<!-- Page content-->
            <div class="container-fluid">
            	<h1 class="my-4">TODO</h1>
            	<form action="users/login_action" method="post">
				  <div class="mb-3">
				    <label for="user_id" class="form-label">아이디</label>
				    <input type="text" class="form-control" id="user_id" name="user_id" required="required">
				  </div>
				  <div class="mb-3">
				    <label for="password" class="form-label">비밀번호</label>
				    <input type="password" class="form-control" id="password" name="user_password" required="required">
				  </div>
				  <input type="submit" class="btn btn-secondary me-2" value="로그인"><a href="users/sign_form" class="btn btn-secondary ms-2">유저 등록하기</a>
				</form>
				<c:if test="${login_fail == true }">
					<span class="wrong">유저명과 비밀번호가 틀립니다.</span>
				</c:if>
			</div>
		</div>
	</div>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>
