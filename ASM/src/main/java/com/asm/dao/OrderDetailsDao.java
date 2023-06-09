package com.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.model.OrderDetails;



public interface OrderDetailsDao  extends JpaRepository<OrderDetails, Integer>{

}
