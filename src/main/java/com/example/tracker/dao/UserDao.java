package com.example.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tracker.entites.User;

public interface UserDao extends JpaRepository<User, Long> {

}
