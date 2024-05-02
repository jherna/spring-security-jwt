package com.example.springsecurityjwt.exceptions;

public class UserNotFoundException extends RuntimeException {
    private static final String DESCRIPTION = "User Not Found Exception (400)";

    public UserNotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }
}
