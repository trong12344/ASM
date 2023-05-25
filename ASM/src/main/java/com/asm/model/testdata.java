package com.asm.model;

import com.asm.dao.UserDAO;

public class testdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAO();
		user.getAllUser().forEach(item -> System.out.println(item));

	}

}
