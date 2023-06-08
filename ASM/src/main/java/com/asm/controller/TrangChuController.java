package com.asm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.interfaces.CartInterface;
import com.asm.interfaces.Imageinterface;
import com.asm.interfaces.ProductInterface;
import com.asm.model.ImageDetails;
import com.asm.model.Product;

@Controller
@ComponentScan("com.asm.interfaces")
public class TrangChuController {
	@Autowired
	ProductInterface proDAO;
	@Autowired
	Imageinterface imgDAO;
	@RequestMapping("trang-chu")
	public String index(Model model) {
		List<Product> product = proDAO.findAll();
		model.addAttribute("product", product);
		return "index";
	}

	@RequestMapping("san-pham/iphone-{id}")
	public String sanpham(@PathVariable("id") Integer id, Model model) {
		Product product = proDAO.getById(id);
		model.addAttribute("product", product);
		ImageDetails image = imgDAO.getById(id);
		model.addAttribute("image", image);
		return "product";
	}

	
}
