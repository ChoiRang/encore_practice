package com.team5.prj.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.team5.prj.users.UserVo;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private SqlSession session;
	
	String nameSpace = "com.team5.config.mappers.user";
	
	@RequestMapping("/users/sign_form")
	public String signForm(Model model) {
		model.addAttribute("confirm", 0);		
		return "users/sign_form";
	}
	
	@RequestMapping("/users/check")
	public String userDuplicateCheck(
			UserVo vo,
			Model model
			) {
		List<String> idList = session.selectList(nameSpace + ".find_id");
		
		
		for(String id : idList) {
			if(vo.getId().equals(id)) {
				vo.setId("");
				model.addAttribute("user_vo", vo);
				model.addAttribute("confirm", 0);
				model.addAttribute("check", "사용불가능한 아이디 입니다.");
				model.addAttribute("url", "/");
				return "users/sign_form";
			}			
		}
		
		model.addAttribute("user_vo",vo);
		model.addAttribute("confirm", 1);
		model.addAttribute("check", "사용이 가능합니다.");
		model.addAttribute("checked_id", vo.getId());
		
		return "users/sign_form";
	}
	
	@RequestMapping(value = "/users/sign_user", method=RequestMethod.POST)
	public String signUser(
			@RequestParam("id") String id,
			@RequestParam("check_id") String check_id,
			@RequestParam("password") String password,
			@RequestParam("nickname") String nickname,	
			UserVo userVo, Model model) {
		
		model.addAttribute("user_vo", userVo);
		
		
		if(id.equals("")) {
			model.addAttribute("msg", "아이디 필수 입력");
			model.addAttribute("confirm", 2);
			return "users/sign_form";
		} else if(password.equals("")) {
			model.addAttribute("msg", "패스워드 필수 입력");
			model.addAttribute("confirm", 3);
			return "users/sign_form";
		} else if(nickname.equals("")) {
			model.addAttribute("msg", "닉네임 필수 입력");
			model.addAttribute("confirm", 4);
			return "users/sign_form";
		} 
		
		//아이디 중복 검사 변경 감지
		if(!id.equals(check_id)) {
			model.addAttribute("confirm", 0);
			model.addAttribute("check", "아이디 중복검사를 다시해 주세요.");			
			return "users/sign_form";
		}
		logger.debug("password{}",userVo.getPassword());
		userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
		logger.debug("password{}",userVo.getPassword());
		session.insert(nameSpace+".insert_user", userVo);	
		return "redirect:/";
	}
	
	@RequestMapping("/users/login_action")
	public String loginAction(
			@RequestParam("user_id") String id,
			@RequestParam("user_password") String password,
			RedirectAttributes redirect,
			Model model
			) {
		UserVo user = session.selectOne(nameSpace + ".find_one", id);
		String b = user.getPassword();
		logger.debug("uservo get password{}", b);
		boolean a = passwordEncoder.matches(user.getPassword(), password);
		logger.debug("match{}",a);
		if(user != null) {
			if(passwordEncoder.matches(password, user.getPassword())) {
				model.addAttribute("id", id);
				return "login_test";	//수정 필
			}			
		}
		
		redirect.addAttribute("login_fail", true);
		return "redirect:/fail";
	}
}
