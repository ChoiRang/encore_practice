package org.sesac.todo_04.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.sesac.todo_04.util.PageNavigator;
import org.sesac.todo_04.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {
	
	@Autowired
	private SqlSession session; // sqlSessionTemplate이 연결됨
	
	// 할일 목록
	@RequestMapping("/todo/list")
	public String todo_list(
			@RequestParam( value="pno",required = false,defaultValue = "1" ) int pno,
			Model model) {
		int rowPerPage = 3 ; //페이지당 보여줄 게시물 수
		int pagePerGrp = 4 ; //하단 보여줄 페이지번호 갯수 
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		int startNo = (pno-1) * rowPerPage ;
		map.put("startNo", startNo);
		map.put("size", rowPerPage );
		
		String ns = "org.sesac.config.mappers.todo";
		List<TodoVo> list = session.selectList(ns+".selectAll", map);
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
		
		return "todo/list"; //뷰이름  =>  /WEB-INF/views/ (뷰이름) .jsp
	}
	
	//등록화면
	@RequestMapping("/todo/insert_form")
	public String todo_insert_form() {
		
		return "todo/insert_form";
	}
	//등록작업
	@RequestMapping("/todo/insert_action")
	public String todo_insert_action(TodoVo vo) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.insert(ns+".insert", vo);
		
		return "redirect:/todo/list";
	}
	//상세
	@RequestMapping("/todo/detail")
	public String todo_detail( @RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.config.mappers.todo";
		TodoVo vo = session.selectOne(ns+".select", no);
		
		model.addAttribute("vo", vo);
		
		return "todo/detail";
	}
	//수정하기
	@RequestMapping("/todo/update_form")
	public String todo_update_form( @RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.config.mappers.todo";
		TodoVo vo = session.selectOne(ns+".select", no);
		
		model.addAttribute("vo", vo);
		
		return "todo/update_form";
	}
	//수정작업
	@RequestMapping("/todo/update_action")
	public String todo_update_action(TodoVo vo) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.update(ns+".update", vo);
		
		return "redirect:/todo/list";
	}
	//삭제작업
	@RequestMapping("/todo/delete_action")
	public String todo_delete_action(@RequestParam("no") int no) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.delete(ns+".delete", no);
		
		return "redirect:/todo/list";
	}
}