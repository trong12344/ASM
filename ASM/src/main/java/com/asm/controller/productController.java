package com.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class productController {
	@RequestMapping("/productManager")
	public String index() {
		return "QuanliSP";
	}
}
