package com.team5.prj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team5.prj.todo.TodoVo;
import com.team5.prj.users.UserVo;
import com.team5.prj.util.PageNavigator;

@Controller
public class TodoMainController {
	
	@Autowired
	private SqlSession session;
	private String ns = "com.team5.config.mappers.todo";

	@RequestMapping("/todo/main")
	public String todo_main(HttpSession httpss, Model model) {
		
		String memid = (String)httpss.getAttribute("member_id");
		String nick = (String)httpss.getAttribute("nickname");
		System.out.println(memid);
		
		List<TodoVo> list = session.selectList(ns+".selectAll", memid);
		model.addAttribute("todo_list", list);
		model.addAttribute("nickname", nick);
		System.out.println(list);
		
		return "todo/main";
	}
	
	@RequestMapping("/todo/detail")
	public String todo_detail(@RequestParam("no") int no, Model model) {
		
		TodoVo vo = session.selectOne(ns+".select", no);
		model.addAttribute("vo", vo);
		
		return "todo/detail";
	}
	
	@RequestMapping("/todo/insert_form")
	public String insert_form(HttpSession httpss, Model model) {
		
		String memid = (String)httpss.getAttribute("member_id");
		System.out.println(memid);
		model.addAttribute("member_id", memid);
		
		return "todo/insert_form";
	}
	
	@RequestMapping("/todo/insert_action")
	public String insert_action(TodoVo vo) {
		System.out.println(vo);
		session.insert(ns+".insert", vo);
		
		
		return "redirect:/todo/main";
	}
	
	@RequestMapping("/todo/update_form")
	public String update_form(@RequestParam("no") int no, Model model) {
		TodoVo todovo = session.selectOne(ns+".select", no);
		model.addAttribute("todovo", todovo);
		return "todo/update_form";
		
		
	}
	
	@RequestMapping("/todo/update_action")
	public String update_action(TodoVo vo) {
		session.update(ns+".update", vo);
		return "redirect:/todo/main";
		
	}
	
	@RequestMapping("/todo/delete_action")
	public String delete_action(@RequestParam("no") int no) {
		session.delete(ns+".delete", no);
		return "redirect:/todo/main";
	}

	@RequestMapping("/todo/mypage")
	public String todo_mypage(HttpSession httpss, Model model) {
		String memid = (String) httpss.getAttribute("member_id");
		UserVo user = session.selectOne("com.team5.config.mappers.user.find_one", memid);
		model.addAttribute("user", user);
		
		return "todo/mypage";
	}

	@RequestMapping("/todo/end_todo")
	public String todo_end_todo(@RequestParam( value="pno",required = false,defaultValue = "1" ) int pno,
			HttpSession httpss, Model model) {
		
		if(pno == 0) { //pno 없이 접근
			return "redirect:/todo/end_todo?pno=1";
		}
		
		int rowPerPage = 5 ; //페이지당 보여줄 게시물 수
		int pagePerGrp = 3 ; //하단 보여줄 페이지번호 갯수 
		
		String memid = (String)httpss.getAttribute("member_id");
		HashMap<String,String> map = new HashMap<String, String>();
		int startNo = (pno-1) * rowPerPage ;
		map.put("startNo", String.valueOf(startNo));
		map.put("size", String.valueOf(rowPerPage) );
		map.put("id", memid );
		
		List<TodoVo> list = session.selectList(ns+".end", map);
		model.addAttribute("todo_list", list);
		
		PageNavigator pnavi = new PageNavigator();//하단 페이지번호 목록 생성
		pnavi.setRowPerPage(rowPerPage);//페이지당 보여줄 게시물 수
		pnavi.setPagePerGrp(pagePerGrp);//하단 보여줄 페이지번호 갯수 
		pnavi.setCurrentPageNo(pno);
		
		// 총게시물 수 추출
		int todo_count = session.selectOne(ns+".count");
		model.addAttribute("todo_count", todo_count);
		
		pnavi.setTotalRow(todo_count);
		
		ArrayList<Integer> pageNavi = pnavi.getPageNavi();
		
		model.addAttribute("pageNavi", pageNavi);
		model.addAttribute("pageNavigator", pnavi);
		
		return "todo/end_todo";
	}
	
}
