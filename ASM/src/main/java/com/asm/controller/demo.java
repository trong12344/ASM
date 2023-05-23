package com.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo {
	@RequestMapping("home")
	public String index(Model model) {
		model.addAttribute("message" ,"ccc");
		return "index";
	}
}
