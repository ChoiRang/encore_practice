<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>today Lotto</title>
	</head>
	<body>
		<h1>get lotto numbers</h1>
		<form action="/generate_6numbers">
			<input type="submit" value="get 6 numbers">
		</form>
		<c:if test="${lotto.size() == 6}">
			<div>
				<h2>Today lotto nubmer is</h2>
				<h2>${lotto}</h2>
			</div>
			<div>
				<c:forEach items="${lotto}" var="num" varStatus="st">
					<h3> ${st.index + 1} = ${num}</h3>
				</c:forEach>		
			</div>
		</c:if>
	</body>
</html>