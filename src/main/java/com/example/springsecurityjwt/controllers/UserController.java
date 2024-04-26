package com.example.springsecurityjwt.controllers;


import com.example.springsecurityjwt.dtos.UserDto;
import com.example.springsecurityjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    public List<UserDto> readAll() {
        //Transformem els DAOs en DTOs
        List<UserDto> userDtos = userService.readAllUsers().stream().map(UserDto::new).collect(Collectors.toList());
        return userDtos;
    }
}
