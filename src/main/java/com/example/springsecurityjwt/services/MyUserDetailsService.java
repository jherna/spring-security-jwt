package com.example.springsecurityjwt.services;

import com.example.springsecurityjwt.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //Buscar a la bd l'usuari i el password
        UserEntity user = userDAO.findByEmail(email);
        return new User(user.getEmail(),user.getPassword(),new ArrayList<>());
    }


}
