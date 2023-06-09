package com.asm.model;

import java.util.Date;
import java.util.List;

import com.asm.model.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "available")
	Boolean isDelete;
	@Temporal(TemporalType.DATE)
	@Column(name = "createdate")
	Date createDate = new Date();
	String image;
	String name;
	double price;
	@ManyToOne
	@JoinColumn(name = "categoryid")
	Category category;
//	@OneToMany(mappedBy = "id")
//	List<OrderDetails> orderDetails;
	@OneToOne(mappedBy = "product")
	ImageDetails imageDetailsl;

	

}
