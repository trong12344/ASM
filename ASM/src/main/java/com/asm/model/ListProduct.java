package com.asm.model;

import java.util.HashMap;
import java.util.Map;

public class ListProduct {
	public static Map <Integer, Product> items = new HashMap<Integer, Product>();
	static {
		items.put(1, new Product(1,"iPhone 14 Pro Max",29.990000,10,"ip14prm.png",30.990000,"khai-truong.webp" ));
		items.put(2, new Product(2,"iPhone 14 Pro",25.190000,10,"ip14pro.png",28.560000 ,"hotsale.png"));
		items.put(3, new Product(3,"iPhone 14 ",20.990000,10,"ip14.png",24.190000,"hotsale.png" ));
		items.put(4, new Product(4,"iPhone 14 Plus",16.990000,10,"ip14p.png",20.290000,"hotsale.png" ));
	}
}
