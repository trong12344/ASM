package com.asm.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asm.dao.UserDAO;
import com.asm.model.User;



@Controller
public class userController {
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//    public userController(UserService userService) {
//        this.userService = userService;
//    }
//
//	@GetMapping("/products")
//	public String showProducts(Model model, Principal principal) {
//		String username = principal.getName();
//		boolean isAdmin = userService.isAdmin(username);
//		if (isAdmin) {
//			return "QuanliUser";
//		} else {
//
//			return "QuanliUser";
//		}
//	}
    @Autowired
    private UserDAO userDao;

    @RequestMapping("/user/show")
    public String showUsers(Model model) {
        List<User> users = userDao.findAll();
        model.addAttribute("users", users);
        return "user/inde";
    }

}
