<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
<script>
        setInterval(function(){
             
            var timer = new Date();
            var hh = timer.getHours();
            var mm = timer.getMinutes();
            if(hh < 10){
            	hh = "0"+hh;
            }
            if(mm < 10){
            	mm = "0"+mm;
            }
            document.getElementById('clock').innerHTML = hh + ":" + mm;
        },1000);
    </script>
</head>
<body>
	<div class="sidebar-heading border-bottom bg-light"><h1>TODO</h1></div>
		<div class=" list-group p-3">
			<h3 class="list-group-item p-3" id="clock"></h3>
		</div>
	<div class="list-group list-group-flush">
	    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="main">MY TODO</a>
	    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="mypage">마이 페이지</a>
	    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="insert_form">일정 등록</a>
	    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="end_todo">내가 해냄</a>
	</div>
			<hr>
	<div class="fixed-bottom">
		<div class=" list-group p-3">
		<p>${nickname} 님 안녕하세요 </p>
		<a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/users/logout_action">로그아웃</a>
		</div>
	</div>
</body>
</html>