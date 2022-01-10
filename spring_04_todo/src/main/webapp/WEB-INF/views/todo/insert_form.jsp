<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할 일 등 록</title>
	<script type="text/javascript">
	window.onload = function(){
		//오늘 날짜 추출
		var today = new Date()
		var year = today.getFullYear();//4자리 연도
		var mon = today.getMonth()+1;
		mon = (mon < 10)?"0"+mon: mon;
		var date = today.getDate();
		date = (date<10)?"0"+date: date;
		// date타입은  입출력 형식은  "YYYY-MM-DD"
		document.querySelector("#regdate").value = year+"-"+mon+"-"+date;
		//alert(year+"-"+mon+"-"+date);
		
	}
	</script>
</head>
<body>
	<h1>할 일 등 록</h1>

	<div>
		<a href="list">할일 목록</a>
	</div>
	<hr>
	<form action="insert_action" method="post">
		<label>
			할 일 제 목:
			<input type="text" name="title">
		</label> <br>
		<label>
			할 일 내 용:
			<input type="text" name="todo">
		</label> <br>
		<label>
			할 일 등 록 일:
			<input id="regdate" type="date" name="regdate">
		</label> <br>
		<label>
			할 일 종 료 일:
			<input type="date" name="enddate">
		</label> <br>
		
		<input type="submit" value="할 일 등 록">
	</form>


</body>
</html>


