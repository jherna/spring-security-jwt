package com.example.springsecurityjwt.dtos;

import com.example.springsecurityjwt.entities.User;
import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String email;
    private String password;
    private String fullName;

    public UserDto(Integer id, String email, String password, String fullName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    public UserDto(User u) {
        this.id = u.getId();
        this.email = u.getEmail();
        this.password = u.getPassword();
        this.fullName = u.getFullName();
    }

    public UserDto() {

    }
}
