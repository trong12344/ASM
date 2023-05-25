package com.asm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import com.asm.interfaces.CartInterface;
import com.asm.model.Product;

public class CartDAO implements CartInterface {

	Map<Integer, Product> map = new HashMap<Integer, Item>();

	@Override
	public Item add(Integer id) {
		Item item = map.get(id);
		if (item == null) {
			item = SP.items.get(id);
			item.setQty(1);
			map.put(id, item);
		} else {
			item.setQty(item.getQty() + 1);
		}
		return item;
	}

	@Override
	public void remove(Integer id) {
		map.remove(id);
	}

	@Override
	public Item update(Integer id, String qty) {
		Item item = map.get(id);
		if (qty.equals("xoa") && item.getQty() > 0) {
			item.setQty(item.getQty() - 1);
			if (item.getQty() == 0) {
				map.remove(item);
			}
		} else if (qty.equals("them") && item.getQty() < 100) {
			item.setQty(item.getQty() + 1);
		}
		return item;
	}

	@Override
	public void clear() {
		map.clear();

	}

	@Override
	public Collection<Item> getItem() {
		return map.values();
	}

	@Override
	public int getCount() {
		return map.values().stream().mapToInt(item -> item.getQty()).sum();
	}

	@Override
	public double getAmout() {
		// TODO Auto-generated method stub
		return map.values().stream().mapToDouble(item -> item.getPrice() * item.getQty()).sum();
	}

	@Override
	public Product add(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Integer id, String sl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
