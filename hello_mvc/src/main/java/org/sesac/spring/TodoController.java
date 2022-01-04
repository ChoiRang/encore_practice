package org.sesac.spring;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	private ArrayList<String> todo_list = new ArrayList<String>();
	
	@RequestMapping("/todo")
	public String todo(Model model) {
		model.addAttribute("todo_list", todo_list);
		return "todo/list";	//WEB-INF/views/todo/list , forwarding
	}
	
	@RequestMapping("/todo_insert_form")
	public String todo_insert_form() {
		return "todo/insert_form";
	}
	
	@RequestMapping("todo_insert_action")
	public String todo_insert_action(@RequestParam("todo") String todo) {
		todo_list.add(todo);
		
//		return "todo/insert_action";	//등록 결과 페이지 보기
		return "redirect:/todo";	//todo로 주소변경
	}
	
	@RequestMapping("/todo_update_form")
	public String todo_update_form(@RequestParam("no") int no, Model model) {
		String todo = todo_list.get(no);
		model.addAttribute("todo", todo);	//jsp에게 전달할 때에는 model 을 이용한다.
		return "todo/update_form";
	}
	
	@RequestMapping("todo_update_action")
	public String todo_update_action(
			@RequestParam("todo") String todo, 
			@RequestParam("no") int no
			) {
		todo_list.set(no, todo);
		
		return "redirect:/todo";
	}
	
	@RequestMapping("/todo_delete_form")
	public String todo_delete_form(@RequestParam("no") int no, Model model) {
		String todo = todo_list.get(no);
		model.addAttribute("todo", todo);
		return "todo/delete_form";
	}
	
	@RequestMapping("todo_delete_action")
	public String todo_delete_action(@RequestParam("no") int no) {
		todo_list.remove(no);
		return "redirect:/todo_2";
	}
}
