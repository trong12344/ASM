package com.asm.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.model.OrderDetails;

public interface OrderDetailDAO extends JpaRepository<OrderDetails, Integer>{

//	@Query("SELECT od \r\n"
//			+ "FROM OrderDetail od \r\n"
//			+ "WHERE od.order.id = ?1 \r\n")
//	List<OrderDetails> findHistoryOrderDetails(Integer id);
//	
//	@Query("SELECT new Report(d.product.category, sum(d.price * d.quantity), sum(d.quantity)) "
//			+ "FROM OrderDetail d GROUP BY d.product.category")
//	List<Report> revenueByCategory();
}
