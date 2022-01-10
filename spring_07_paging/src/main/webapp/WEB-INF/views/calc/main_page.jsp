<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>simple calc</title>
	</head>
	<body>
		<h1>simple calc</h1>
		<form action="/calc_action">
			<input type="number" name="num1" size="5">
			<select name="opr">
				<option>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select>
			<input type="number" name="num2" size="5">
			<input type="submit" value="=">
		</form>
		<div>
			<c:if test="${result.length() > 0}">
			${param.num1} ${param.opr} ${param.num2} = ${result}
			</c:if>
		</div>				
		<input type="text" value="" readonly="readonly" size="10">
		
	</body>
</html>