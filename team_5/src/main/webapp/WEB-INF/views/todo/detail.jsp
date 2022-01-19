<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Todo 상세정보</title>
<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
	<script type="text/javascript">
	window.onload = function(){
		document.querySelector("#del_link").onclick = function(){
			return confirm("일정을 삭제할까요?");
		}
	}
	</script>
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
	           	<h1 class="mt-4">MyTodo 상세 정보</h1>
               <form>
				  <div class="mb-3">
				    <label for="content" class="form-label">일정내용</label>
				    <input type="text" class="form-control" id="content" name="content" value="${vo.content}" readonly>
				  </div>
				  <div class="mb-3">
				    <label for="regdate" class="form-label">시작일</label>
				    <input type="date" class="form-control" id="regdate" name="regdate" value="${vo.regdate}" readonly>
				  </div>
				  <div class="mb-3">
				    <label for="enddate" class="form-label">마감일</label>
				    <input type="date" class="form-control" id="enddate" name="enddate" value="${vo.enddate}" readonly>
				  </div>
				  <c:choose>
					<c:when test="${vo.ck==1 }">
						<div class="mb-3">
				    		<label for="intro" class="form-label">완료여부</label>
				    		<input type="text" class="form-control" id="intro" name="intro" value="완료" readonly>
				  		</div>
					</c:when>
					<c:when test="${vo.ck==0 }">
						<div class="mb-3">
				    		<label for="intro" class="form-label">완료여부</label>
				    		<input type="text" class="form-control" id="intro" name="intro" value="미완료" readonly>
				  		</div>
					</c:when>
				  </c:choose>
				  <a href="update_form?no=${vo.no}" class="btn btn-secondary me-2">수정</a><a id="del_link" href="delete_action?no=${vo.no}" class="btn btn-secondary ms-2">삭제</a>
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