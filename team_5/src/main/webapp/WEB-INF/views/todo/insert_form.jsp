<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>일정 등록</title>
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
            	<h1 class="my-4">일정 등록</h1>
            	<form action="insert_action" method="post">
            	<input type="hidden" name="member_id" value="${member_id}">
				  <div class="mb-3">
				    <label for="inputcontent" class="form-label">일정</label>
				    <input type="text" class="form-control" id="inputcontent" aria-describedby="contentHelp" name="content">
				    <div id="contentHelp" class="form-text">일정을 적어주세요.</div>
				  </div>
				  <div class="mb-3">
				    <label for="todoregdate" class="form-label">시작일</label>
				    <input type="date" class="form-control" id="todoregdate" name="regdate">
				  </div>
				  <div class="mb-3">
				    <label for="todoenddate" class="form-label">마감일</label>
				    <input type="date" class="form-control" id="todoenddate" name="enddate">
				  </div>
				  <div class="mb-3 form-check">
				    <input type="checkbox" class="form-check-input" id="importanceCheck" name="importance" value="1">
				    <label class="form-check-label" for="importanceCheck">중요일정체크</label>
				  </div>
				  <input type="submit" class="btn btn-secondary me-2" value="일정등록"><a href="main" class="btn btn-secondary ms-2">취소</a>
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