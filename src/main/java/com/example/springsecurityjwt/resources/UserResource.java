package com.example.springsecurityjwt.resources;

import com.example.springsecurityjwt.controllers.UserController;
import com.example.springsecurityjwt.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserResource.USERS)
public class UserResource {
    public static final String USERS = "/api/v0/users";

    @Autowired
    UserController userController;


    @GetMapping
    private ResponseEntity<List<UserDto>> users() {
        return new ResponseEntity<>(userController.readAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<UserDto> newUser(@RequestBody UserDto user) {
        return ResponseEntity.ok(userController.addUser(user));
    }


}
