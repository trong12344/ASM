package com.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.model.Products;

public interface ProductDAO extends JpaRepository<Products, Integer> {

}
