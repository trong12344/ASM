package com.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@ComponentScan("com.asm.dao")
public class TrangChuController {
//	@Autowired
//	CartInterface cart;
//
//	@RequestMapping("trang-chu")
//	public String index(Model model) {
//		model.addAttribute("ip14", ListProduct.items.values());
//		return "index";
//	}
//
//	@RequestMapping("san-pham/iphone-{id}")
//	public String sanpham(@PathVariable("id") Integer id, Model model) {
//		Product product = ListProduct.items.get(id);
//		model.addAttribute("product", product);
//		return "product";
//	}
//
//	@RequestMapping("thanh-toan")
//	public String cart(Model model) {
//		model.addAttribute("cart", cart);
//		return "cart";
//	}
//
//	@RequestMapping("add/iphone-{id}")
//	public String add(@PathVariable("id") Integer id) {
//		cart.add(id);
//		return "redirect:/thanh-toan";
//	}
//
//	@RequestMapping("/remove/iphone-{id}")
//	public String remove(@PathVariable("id") Integer id) {
//		cart.remove(id);
//		return "redirect:/thanh-toan";
//	}
//
//	@RequestMapping("update/iphone-{id}/{pre}")
//	public String update(@PathVariable("id") Integer id, @PathVariable("pre") String pre) {
//		cart.update(id, pre);
//		return "redirect:/thanh-toan";
//	}
//
//	@RequestMapping("clear")
//	public String clear() {
//		cart.clear();
//		return "redirect:/thanh-toan";
//	}

}
