package org.sesac.paging.calc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	
	@RequestMapping(value = "/calc_page", method = RequestMethod.GET)
	public String calc_page() {
		return "calc/main_page";
	}
	
	
	@RequestMapping(value = "/calc_action", method = RequestMethod.GET)
	public String calc_action(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2,
			@RequestParam("opr") String opr,
			Model model
			) {
		String result = "";
		if(opr.equals("+")) {
			result = num1 + num2 + "";
		}else if(opr.equals("-")) {
			result = num1 - num2 + "";
		}else if(opr.equals("*")) {
			result = num1 * num2 + "";
		}else if(opr.equals("/")) {
			result = 1.0 * num1 / num2 + "";
		}
		
		model.addAttribute("result", result);
		
		return "calc/main_page";
	}
	
}
