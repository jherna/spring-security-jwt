package com.example.springsecurityjwt.services;

import com.example.springsecurityjwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {
    List<User> findAll();
    Optional<User> findById(Integer integer);
    User findByEmail(String email);
}
