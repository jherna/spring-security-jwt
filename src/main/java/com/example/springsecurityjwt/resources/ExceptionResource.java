package com.example.springsecurityjwt.resources;

import com.example.springsecurityjwt.dtos.UserDto;
import com.example.springsecurityjwt.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ExceptionResource.EXCEPTIONS)
public class ExceptionResource {
    public static final String EXCEPTIONS = "/api/v0/exceptions";
    public static final String ERROR = "/error";
    public static final String ID = "/{id}";

    @GetMapping(ERROR + ID)
    public ResponseEntity<UserDto> doError(@PathVariable int id) {
        if (id == 0) {
            throw new UserNotFoundException("id:" + id );
        }
        return ResponseEntity.ok(new UserDto(id, "email", "password", "fullName"));
    }



}
