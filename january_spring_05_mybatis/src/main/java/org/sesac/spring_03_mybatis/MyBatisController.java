package org.sesac.spring_03_mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.sesac.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBatisController {
	@Autowired
	private SqlSession session;
	
	@RequestMapping("/test_session")
	public String test_con() throws SQLException{

		String ns = "org.sesac.todo_mapper";
		List<TodoVo> list = session.selectList(ns+".selectAll");
		System.out.println("저장횟수"+list.size());
		for(TodoVo vo : list) {
			System.out.println(vo);
		}
		
		return "home";
	}
}
