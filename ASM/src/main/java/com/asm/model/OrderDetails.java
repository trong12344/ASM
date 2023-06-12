package com.asm.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetails {
	@Id
	String id;
	double price;
	@Column(name = "quantity")
	int soluong;
	@ManyToOne
	@JoinColumn(name = "orderid")
	Orders ordersID;
	@ManyToOne
	@JoinColumn(name = "productid")
	Product productID;

}
