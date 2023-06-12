package com.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.interfaces.UserInterfaces;
import com.asm.model.Account;
import com.asm.model.Category;
import com.asm.model.Product;
@Controller
public class userController {
	@Autowired
	UserInterfaces udao;
	@RequestMapping("/userManager")
	public String index(Model model) {
		model.addAttribute("user", udao.findAll());
		return "QuanliUser";
	}
	@RequestMapping("/edit-user/{id}")
	public String edit(@PathVariable("id") String id, Model model, @ModelAttribute("user") Account account) {
		Account user = udao.findById(id).get();		
		account.setFullname(user.getFullname());
		account.setUsername(user.getUsername());
		account.setPassword(user.getPassword());
		account.setEmail(user.getEmail());
		model.addAttribute("account", account);
		return "editUser";
		
	}
	
	
}
