package com.example.springsecurityjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


/*
    https://www.youtube.com/watch?v=X80nJ5T7YpE&t=8m
*/

/*
* https://medium.com/@bhushannemade2001/spring-boot-3-1-jwt-authentication-authorization-secure-your-apis-like-a-pro-4873e507db4d
*/

/*
    https://www.youtube.com/watch?v=nwqQYCM4YT8
*/

@SpringBootApplication
public class SpringSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }


}
