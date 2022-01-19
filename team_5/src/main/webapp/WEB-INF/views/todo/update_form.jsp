<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>일정 수정</title>
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
	           	<h1 class="mt-4">일정 수정</h1>
               <form action="update_action" method="post">
					<input type="hidden" name="no" value="${todovo.no }">
				  <div class="mb-3">
				    <label for="content" class="form-label">일정내용</label>
				    <input type="text" class="form-control" id="content" name="content" value="${todovo.content}">
				  </div>
				  <div class="mb-3">
				    <label for="regdate" class="form-label">시작일</label>
				    <input type="date" class="form-control" id="regdate" name="regdate" value="${todovo.regdate}">
				  </div>
				  <div class="mb-3">
				    <label for="enddate" class="form-label">마감일</label>
				    <input type="date" class="form-control" id="enddate" name="enddate" value="${todovo.enddate}">
				  </div>
		  		  <div class="mb-3 form-check">
				    <input type="checkbox" class="form-check-input" id="endCheck0" name="ck" value="0">
				    <label class="form-check-label" for="endCheck0">미완료</label>
				  </div>
				  <div class="mb-3 form-check">
				    <input type="checkbox" class="form-check-input" id="endCheck1" name="ck" value="1">
				    <label class="form-check-label" for="endCheck1">완료</label>
				  </div>
				  <input type="submit" class="btn btn-secondary me-2" value="일정수정">
				  <a href="main" class="btn btn-secondary ms-2">취소</a>
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