<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>완료화면</title>
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
	<!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
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
    		<h1 class="mt-4">내 가 해 냄</h1>
    		<h3 class="mt-4">해낸 거</h3>
    			<div class="card my-4">
				  <ul class="list-group list-group-flush">
					<c:forEach items="${todo_list}" var="todo">
				    	<li class="list-group-item"><a class="text-dark" style="text-decoration: none" href="detail?no=${todo.no}">${todo.content}</a></li>
					</c:forEach>
				  </ul>
				</div>
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item">
			<c:if test="${ pageNavi[0] != 1 }">
		      <a class="page-link" href="end_todo?pno=${pageNavi[0]-1}" aria-label="Previous" >
		        <span aria-hidden="true">&laquo;</span>
		      </a>
			</c:if>
		    </li>
			<c:forEach items="${pageNavi}" var="pageNo">
		    <li class="page-item"><a class="page-link" href="end_todo?pno=${pageNo}">${pageNo}</a></li>
			</c:forEach>
		    <li class="page-item">
			<%-- 2페이지로 누르면 딴데갑니다.... 시연할때는 누르지말아주세요.. 제힘으로는 도저히..--%>		
			<c:if test="${ pageNavi[pageNavi.size()-1] < pageNavigator.maxPage  }">
		      <a class="page-link" href="end_todo?pno=${pageNavi[pageNavi.size()-1] + 1}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
			</c:if>
		    </li>
		  </ul>
		</nav>
		</div>
	</div>
</div>
</body>
</html>