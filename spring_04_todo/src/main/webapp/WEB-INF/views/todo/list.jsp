<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할 일 목 록</title>
</head>
<body>
	<h1>할 일 목 록</h1>
	
	<a href="insert_form">글 등 록</a>
	<hr>
	저장갯수: ${todo_count}
	<h2>목록</h2>
	<table border="1">
	  <tr>
	    <th>번호</th>
	    <th>제목</th>
	  </tr>
	  <c:forEach items="${todo_list}" var="todo">
	  <tr>
	    <td>${todo.no}</td>
	    <td><a href="detail?no=${todo.no}">${todo.title}</a></td>
	  </tr>
	  </c:forEach>
	</table>
	
	<div>
		<c:if test="${pageNavi[0] != 1}">
			<a href="list?pno=${pageNavi[0]-1}">previous</a>
		</c:if>
		<c:forEach items="${pageNavi}" var="pageNo">
		<a href="list?pno=${pageNo}">${pageNo}</a> 
		</c:forEach>
		<c:if test="${pageNavi[pageNavi.size()-1] != 1}">
			<a href="list?pno=${pageNavi[pafeNavi.size()-1]+1}">next</a>
		</c:if>
	</div>

</body>
</html>
