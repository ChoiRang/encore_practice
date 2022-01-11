<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상 세 보 기</title>
</head>
<body>
	<h1>상 세 보 기</h1>
	할일번호: ${vo.no} <br>
	할일 제목: ${vo.title} <br>
	할일 내용: ${vo.todo} <br>
	할일 등록일: ${vo.regdate} <br>
	할일 마감일: ${vo.enddate} <br>
	
	<a href="${param.target == null? 'list' : 'search_list' }?pno=${param.pno }">목록</a>
	<a href="update_form?no=${vo.no}&pno=${param.pno}">수정</a>
	<a href="delete_action?no=${vo.no}&pno=${param.pno}">삭제</a>

</body>
</html>