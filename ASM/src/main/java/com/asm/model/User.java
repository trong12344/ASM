package com.asm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private String userId;
	private String username;
	private String password;
	private String fullNamme;
	private Boolean role;
}
