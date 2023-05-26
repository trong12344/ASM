package com.asm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.asm.interfaces.CartInterface;
import com.asm.model.ListProduct;
import com.asm.model.Product;
@Service
public class CartDAO implements CartInterface {

	Map<Integer, Product> map = new HashMap<Integer, Product>();

	@Override
	public Product add(Integer id) {
		Product item = map.get(id);
		if (item == null) {
			item = ListProduct.items.get(id);
			item.setSl(1);
			map.put(id, item);
		} else {
			item.setSl(item.getSl() + 1);
		}
		return item;
	}

	@Override
	public void remove(Integer id) {
		map.remove(id);
	}

	@Override
	public Product update(Integer id, String qty) {
		Product item = map.get(id);
		if (qty.equals("xoa") && item.getSl() > 0) {
			item.setSl(item.getSl() - 1);
			if (item.getSl() == 0) {
				map.remove(item);
			}
		} else if (qty.equals("them") && item.getSl() < 100) {
			item.setSl(item.getSl() + 1);
		}
		return item;
	}

	@Override
	public void clear() {
		map.clear();

	}

	@Override
	public Collection<Product> getProduct () {
		return map.values();
	}

	@Override
	public int getCount() {
		return map.values().stream().mapToInt(item -> item.getSl()).sum();
	}

	@Override
	public double getAmout() {
		// TODO Auto-generated method stub
		return map.values().stream().mapToDouble(item -> item.getPrice() * item.getSl()).sum();
	}

	public Product getSanPham(Integer id) {	
		Product item = map.get(id);
		return item;		
	}



}
