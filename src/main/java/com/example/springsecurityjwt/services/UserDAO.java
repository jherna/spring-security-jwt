package com.example.springsecurityjwt.services;

import com.example.springsecurityjwt.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findAll();
    Optional<UserEntity> findById(Integer integer);
    UserEntity findByEmail(String email);
}
