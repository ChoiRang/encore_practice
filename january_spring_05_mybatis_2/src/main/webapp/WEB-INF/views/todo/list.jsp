<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>할 일 목록</title>
	</head>
	<body>
		<h1>할 일 목록</h1>
		<div>
		<a href="insert_form">할 일 등록하기</a>
		</div>
		<div>
			저장 갯수 : ${ todo_list.size() }
		</div>
		<h2>저장된 목록들</h2>
		<table border="1">
			<tr>
				<th>번호</th>			
				<th>제목</th>			
			</tr>
			<c:forEach items="${ todo_list }" var="todo">
			<tr>
				<th>${ todo.no }</th>			
				<th>${ todo.title }</th>
				<th><a href="detail?no='${todo}'">상세보기</a></th>
			</tr>
			</c:forEach>
		</table>	
	</body>
</html>