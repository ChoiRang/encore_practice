<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String nick_name;
	int max_count = 5;
	int count = 0;
%>
<%
	//first 
	String command = request.getParameter("command");
	

	if(command == null){
		pageContext.forward("input_name.jsp");
	} else if(command.equals("input_nick_name")){
		nick_name = request.getParameter("nick_name");
		application.setAttribute("nick_name", nick_name);
		max_count = Integer.parseInt(request.getParameter("level"));
		application.setAttribute("max_count", max_count);
		count = 1;
		request.setAttribute("count", count);
		request.setAttribute("result", "");					//첫페이지 null 값 방지
		
		pageContext.forward("play_game.jsp");
	} else if(command.equals("play")){
		String result = "정답입니다";
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		String opr1 = request.getParameter("opr");
		int ans = Integer.parseInt(request.getParameter("answer"));
		
		if(opr1.equals("+")){
			result = ((n1 + n2) == ans? "정답입니다":"오답입니다");
		}	else if(opr1.equals("-")){
			result = ((n1 - n2) == ans? "정답입니다":"오답입니다");
		}	else if(opr1.equals("*")){
			result = ((n1 * n2) == ans? "정답입니다":"오답입니다");
		}
		
		
		//요청할 때마다 바뀌는 값은 request 에 저장한다.
		request.setAttribute("result", result); 
		count++;
		request.setAttribute("count", count); 
		
		if(result.contains("정답입니다")){
			if(count > max_count){
				pageContext.forward("end_game.jsp");
			} else{
				pageContext.forward("play_game.jsp");
			}
		} else if(result.contains("오답입니다")){
			pageContext.forward("incorrect.jsp");		
		}
		
	}

	
%>

<h1>wrong request</h1>
