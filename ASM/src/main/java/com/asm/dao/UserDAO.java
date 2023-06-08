package com.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.asm.model.User;
@Repository
@Component
public interface UserDAO extends JpaRepository<User, Integer>{

}
