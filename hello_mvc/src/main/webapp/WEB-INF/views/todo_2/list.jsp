<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>할일 목록2</h1>
		
		<div>
			<a href="todo_2_insert_form">할 일 등 록</a>
		</div>
		<div>
			<h3>등록개수: ${ todo_list.size() }</h3>
		</div>
		
		<ul>
		<c:forEach items="${ todo_list }" var="todo" varStatus="v">
		
			<li> ${ todo.title }
				<a href="todo_2_update_form?no=${ v.index }">수정</a> /
				<a href="todo_2_delete_form?no=${ v.index }">삭제</a>
			</li>
			
		</c:forEach>
		</ul>
		
	</body>
</html>