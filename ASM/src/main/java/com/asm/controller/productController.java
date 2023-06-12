package com.asm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.asm.interfaces.ProductInterface;
import com.asm.model.Category;
import com.asm.model.Product;
@Controller
public class productController {
	@Autowired
	ProductInterface proDAO;
	
	@RequestMapping("/productManager")
	public String index(Model model) {
		
		model.addAttribute("product",proDAO.findAll());
		return "QuanliSP";
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, Model model, @ModelAttribute("product") Product product) {
		Product pro = proDAO.findById(id).get();
		Category cate = new Category();
		cate.setId(pro.getCategory().getId());
		cate.setName(pro.getCategory().getName());
		product.setId(pro.getId());
		product.setName(pro.getName());
		product.setPrice(pro.getPrice());			
		product.setSl(pro.getSl());
		product.setImage(pro.getImage());
		product.setCategory(cate);
		product.setCreateDate(pro.getCreateDate());
		product.setImageDetailsl(pro.getImageDetailsl());		
		model.addAttribute("product", product);
		return "updateProduct";
		
	}
	@RequestMapping("/update")
	public String update(Model model, @ModelAttribute("product") Product product) {
		proDAO.save(product);
		
		return "redirect:/productManager";
	}
	
}
