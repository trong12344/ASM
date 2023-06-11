package com.asm.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.model.User;

public interface UserInterfaces extends JpaRepository<User, String> {
	@Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
	public User findAccount(String username, String password);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.fullname = ?1")
	public User findByFullname(String fullName);
	
}
