package org.sesac.spring_mybatis_02.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.sesac.todo.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	@Autowired
	private SqlSession session;
	
	@RequestMapping("/todo/list")
	public String todo_list(Model model) {
		String ns = "org.sesac.mappers.todo";
		List<TodoVo> list = session.selectList(ns+".selectAll");
		
		System.out.println("save count : " + list.size());
		model.addAttribute("todo_list", list);
		
		return "todo/list";
	}
	
	@RequestMapping("/todo/insert_form")
	public String insert_form() {
		
		return "todo/insert_form";
	}
	
	@RequestMapping("/todo/insert_action")
	public String insert_action(
//		@RequestParam("title") String title,
			TodoVo vo		//if parameter name & value name are same
			) {
		String ns = "org.sesac.mappers.todo";
		session.insert(ns + ".insert",vo);
		
//		return "todo/insert_action";
		return "redirect:/todo/list";
	}
	
	@RequestMapping("/todo/detail")
	public String todo_detail(
			TodoVo vo, Model model
			) {
		model.addAttribute(vo);
		
		return "todo/detail";
	}
}
