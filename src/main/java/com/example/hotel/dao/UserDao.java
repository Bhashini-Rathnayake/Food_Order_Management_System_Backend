package com.example.hotel.dao;

import com.example.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUserNameAndUserPassword(String UserName, String UserPassword);
}
