<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>마이페이지</title>
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
</head>
<body>
	<div class="d-flex" id="wrapper">
		<!-- Sidebar-->
        <div class="border-end bg-white" id="sidebar-wrapper">
			<jsp:include page="todoNavi.jsp"></jsp:include>
        </div>
        <!-- Page content wrapper-->
        <div id="page-content-wrapper">
			<!-- Page content-->
            <div class="container-fluid">
            	<h1 class="my-4">마이페이지</h1>
            	<form>
            	<input type="hidden" name="member_id" value="${member_id}">
				  <div class="mb-3">
				    <label for="inputnickname" class="form-label">닉네임</label>
				    <input type="text" class="form-control" id="inputnickname" name="nickname" value="${user.nickname}" readonly>
				  </div>
				  <div class="mb-3">
				    <label for="tel" class="form-label">Tel</label>
				    <input type="text" class="form-control" id="tel" name="tel" value="${user.tel}" readonly>
				  </div>
				  <div class="mb-3">
				    <label for="email" class="form-label">Email</label>
				    <input type="email" class="form-control" id="email" name="email" value="${user.email}" readonly>
				  </div>
				  <div class="mb-3">
				    <label for="intro" class="form-label">자기소개</label>
				    <input type="text" class="form-control" id="intro" name="intro" value="${user.intro}" readonly>
				  </div>
				  <a href="#" class="btn btn-secondary me-2">수정</a><a href="main" class="btn btn-secondary ms-2">취소</a>
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