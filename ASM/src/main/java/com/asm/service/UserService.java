package com.asm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.dao.UserRepository;
import com.asm.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public boolean isAdmin(String username) {
		User user = userRepository.findByUsername(username);
		return user != null && user.isAdmin();
	}
}
