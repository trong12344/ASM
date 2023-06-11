package com.asm.model;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "`user`")
public class User {
	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "fullname")
	private String fullname;

	@Column(name = "password")
	private String password;

	@Column(name = "photo")
	private String photo;

	@Column(name = "activated", columnDefinition = "default 1")
	private Boolean activated;

	@Column(name = "admin", columnDefinition = "default 0")
	private Boolean admin;

}
