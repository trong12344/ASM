package com.asm.model;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Accounts")
public class User {
	private static final long serialVersionUID = 1L;
	@Id
	String username;
	boolean activated = true;
	boolean admin = false;
	String email;
	String fullname;
	String password;
	String photo = "";
	@OneToMany(mappedBy = "account")
	List<Order> orders;
}
