<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="org.apache.ibatis.io.Resources"%>
<%@ page import="member.vo.MemberVo"%>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@ page import="org.apache.ibatis.session.SqlSession"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member list</title>
	</head>
	<body>
		<table border="3">
			<tr>
				<th>member number</th>
				<th>member name</th>
				<th>member tel</th>
			</tr>
<%
	SqlSessionFactory sqlSessionFactory = null;
	String resource = "mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	
	List<MemberVo> memberArr = null;
	try (SqlSession ss = sqlSessionFactory.openSession(true)) {
		memberArr = ss.selectList("member.selectAll");
	}

	for(MemberVo memberInfo : memberArr){
		out.println("<tr>");
		out.println("<td>" + memberInfo.getNo() + "</td>");
		out.println("<td>" + memberInfo.getName() + "</td>");
		out.println("<td>" + memberInfo.getTel() + "</td>");
		out.println("<td>" + memberInfo.getIntro() + "</td>");
		out.println("</tr>");
	}

%>
		</table>
	</body>
</html>