package com.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class userController {
	@RequestMapping("/userManager")
	public String index() {
		return "QuanliUser";
	}
}
