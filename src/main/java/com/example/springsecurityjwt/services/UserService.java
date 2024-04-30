package com.example.springsecurityjwt.services;

import com.example.springsecurityjwt.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //Buscar a la bd l'usuari i el password
        User user = userDAO.findByEmail(email);
        System.out.println(user);
        //MyUserDetails myUserDetails = new MyUserDetails(user);
        //return myUserDetails;
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),new ArrayList<>());
    }

    public List<User> readAllUsers() {
        return userDAO.findAll();
    }

    public User addUser(User user) {
        return userDAO.save(user);
    }


}
