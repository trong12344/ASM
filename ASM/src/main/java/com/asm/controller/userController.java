package com.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.interfaces.UserInterfaces;
import com.asm.model.Account;
@Controller
public class userController {
	@Autowired
	UserInterfaces udao;
	@RequestMapping("/userManager")
	public String index(Model model) {
		model.addAttribute("user", udao.findAll());
		return "QuanliUser";
	}
}
