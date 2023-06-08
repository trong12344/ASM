package com.asm.interfaces;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import com.asm.model.Product;
@Service
public interface ProductInterface extends JpaRepository<Product, Integer> {

}
