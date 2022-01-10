package org.sesac.paging.lotto;

import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LottoController {
	
	@RequestMapping("/lotto_page")
	public String lotto_page() {
		
		return "lotto/lotto_page";
	}
	
	@RequestMapping("/generate_6numbers")
	public String generate_6numbers(Model model) {
		int number = 0;
		TreeSet<Integer> set = new TreeSet<Integer>();

		while(set.size() < 6) {
			set.add((int)(Math.random()*45+1));
		}
		
		model.addAttribute("lotto", set);
		
		return "lotto/lotto_page";
	}
}
