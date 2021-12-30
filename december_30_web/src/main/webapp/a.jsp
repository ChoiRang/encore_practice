<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>a.jsp</title>
	</head>
	<body>
		<%request.setAttribute("msg", "hello request");
			Object o = session.getAttribute("cpount");
			if(o == null){
				session.setAttribute("count", 1);
			} else{
				int count = (Integer)session.getAttribute("count");
				count++;
				session.setAttribute("count", count);
			}
			pageContext.forward("b.jsp");
		%>
	
	
	</body>
</html>