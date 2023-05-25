package com.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TrangChuController {
	
	@RequestMapping("trang-chu")
	public String index() {
		return "index";
	}
	@RequestMapping("san-pham")
	public String sanpham() {
		return "product";
	}
}
