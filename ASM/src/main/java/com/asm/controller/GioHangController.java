package com.asm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.interfaces.CartInterface;
import com.asm.model.Product;
@Controller
public class GioHangController {
	@Autowired
	CartInterface cart;
	
	@RequestMapping("thanh-toan")
	public String cart(Model model) {
		model.addAttribute("cart", cart);
		return "cart";
	}

	@RequestMapping("add/iphone-{id}")
	public String add(@PathVariable("id") Integer id) {
		cart.add(id);
		return "redirect:/thanh-toan";
	}

	@RequestMapping("/remove/iphone-{id}")
	public String remove(@PathVariable("id") Integer id) {
		cart.remove(id);
		return "redirect:/thanh-toan";
	}

	@RequestMapping("update/iphone-{id}/{pre}")
	public String update(@PathVariable("id") Integer id, @PathVariable("pre") String pre) {
		cart.update(id, pre);
		return "redirect:/thanh-toan";
	}

	@RequestMapping("clear")
	public String clear() {
		cart.clear();
		return "redirect:/thanh-toan";
	}
	@RequestMapping("/confirmOder")
	public String oder(Model model) {
		model.addAttribute("cart", cart);
		return "orderdetails";
	}
}
