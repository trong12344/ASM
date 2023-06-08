package com.asm.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.asm.service.UserService;

@Controller
public class userController {
	@Autowired
	private UserService userService;

	@Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }

	@GetMapping("/products")
	public String showProducts(Model model, Principal principal) {
		String username = principal.getName();
		boolean isAdmin = userService.isAdmin(username);
		if (isAdmin) {
			return "QuanliUser";
		} else {

			return "QuanliUser";
		}
	}

}
