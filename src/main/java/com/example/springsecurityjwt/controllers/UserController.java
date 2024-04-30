package com.example.springsecurityjwt.controllers;


import com.example.springsecurityjwt.dtos.UserDto;
import com.example.springsecurityjwt.entities.User;
import com.example.springsecurityjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    PasswordEncoder encoder;


    public List<UserDto> readAll() {
        //Transformem els DAOs en DTOs
        List<UserDto> userDtos = userService.readAllUsers().stream().map(UserDto::new).collect(Collectors.toList());
        return userDtos;
    }

    public UserDto addUser(UserDto user) {
        //Transformem a User i encriptem el password
        User u = new User(user);
        String pass = encoder.encode(user.getPassword());
        u.setPassword(pass);

        return new UserDto(userService.addUser(u));
    }
}
