<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TODO LIST MAIN</title>
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
	           	<h1 class="mt-4">MY TODO</h1>
                <p>TODO로 성공적인 일정관리!</p>
                <div class="card">
				  <ul class="list-group list-group-flush">
					<c:forEach items="${todo_list}" var="todo">
				    	<li class="list-group-item"><!-- <input type="checkbox" name="end_check">  --><a class="text-dark" style="text-decoration: none" href="detail?no=${todo.no}">${todo.content}</a></li>
					</c:forEach>
				  </ul>
				</div>
			</div>
		</div>
	</div>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>