package com.asm.interfaces;

import java.util.Collection;

import com.asm.model.Product;

public interface CartInterface {
	Product add(Integer id);

	void remove(Integer id);

	Product update(Integer id, String sl);

	void clear();

	Collection<Product> getProduct();

	int getCount();

	double getAmout();
		
	
}
