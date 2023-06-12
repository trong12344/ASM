package com.asm.interfaces;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.asm.model.Product;
import com.asm.model.categoryReport;
@Service
public interface ProductInterface extends JpaRepository<Product, Integer> {
	@Query(value = "Select * from products where categoryid =:categoryId", nativeQuery = true)
	List<Product> getProductByCate(@Param("categoryId") String categoryId);
	@Query("SELECT new categoryReport(o.category.name, sum(o.price), count(o)) from Product o group by o.category.name order by sum(o.price) desc")
	List<categoryReport> getInventoryByCategory();
	
}
