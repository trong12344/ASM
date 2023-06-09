package com.asm.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@Column(name = "Price")
	Double price;
	@Column(name = "Quantity")
	Integer quantity;
	@ManyToOne
	@JoinColumn(name = "Orderid")
	Order order;
	@ManyToOne
	@JoinColumn(name = "Productid")
	Product product;

}
