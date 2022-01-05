<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당 목록 상세보기</title>
	</head>
	<body>
		<h1>상세보기</h1>

			<fieldset>
			
				<legend>제  &nbsp; 목 </legend> 
				<br>
			</fieldset>
				내  &nbsp; 용 : 
				<input type="text" name="todo"><br>
				등록일 :
				<input type="date" name="regdate"><br>
				종료일 :
				<input type="date" name="enddate"><br>
				<input type="submit" id="btr" value="등록 하기">
	</body>
</html>