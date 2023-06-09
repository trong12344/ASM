package com.asm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asm.dao.CategoryDAO;
import com.asm.dao.ProductDAO;
import com.asm.interfaces.CartInterface;
import com.asm.model.CartItems;
import com.asm.model.Category;
import com.asm.model.Product;
import com.asm.service.CookieService;
import com.asm.service.SessionService;
import com.asm.service.ShoppingCartService;

;
@Controller
public class GioHangController {

	@Autowired
	CategoryDAO daoCategory;
	
	@Autowired
	ProductDAO daoProduct;
	
	@Autowired
	CookieService cookie;
	
	@Autowired
	SessionService session;
	
	@Autowired
	ShoppingCartService cart;
	
	@RequestMapping("/cart/view")
	public String cartView(Model model) {
		model.addAttribute("TitlePage", "Cart");
		model.addAttribute("view", "/views/cart.jsp");

		List<Category> categories = daoCategory.findAll();
		model.addAttribute("categories", categories);
		
		model.addAttribute("cart", cart);
		model.addAttribute("Count", cart.getCount());
		
		return "cart/cart";
	}
	
	@RequestMapping("/cart/add/{id}")
	public String add(@PathVariable("id") Integer id) {
		Product product = daoProduct.getById(id);
		if(product != null) {
			CartItems item = new CartItems();
			item.setIdProduct(product.getId());
			item.setNameProduct(product.getName());
			item.setPrice(product.getPrice());
			item.setQuantity(1);
			cart.add(item);
		}
	
//		System.out.println("Add ITEM: " + id);
		return "redirect:/cart/view"; // hiển thị giỏ hàng
	}

	@RequestMapping("/cart/remove/{id}")
	public String remove(@PathVariable("id") Integer id) {
		cart.remove(id);
		
//		System.out.println("Remove ITEM: " + id);
		return "redirect:/cart/view";
	}

	@RequestMapping("/cart/update/{id}")
	public String update(@PathVariable("id") Integer id, @RequestParam("quantity") Integer quantity) {
		cart.update(id, quantity);
//		System.out.println("Update ITEM: " + id + "; Qty = " + quantity);
		return "redirect:/cart/view";
	}

	@RequestMapping("/cart/clear")
	public String clear() {
		cart.clear();

//		System.out.println("CLEAR CART");
		return "redirect:/cart/view";
	}
	
////	@Autowired
//	CartInterface cart;
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
