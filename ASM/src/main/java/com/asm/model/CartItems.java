package com.asm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItems {
	int idProduct;
	String imgProduct;
	String nameProduct;
	double price;
	int quantity = 1;
}
