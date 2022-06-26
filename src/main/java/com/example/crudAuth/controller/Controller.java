package com.example.crudAuth.controller;

import com.example.crudAuth.collections.Role;
import com.example.crudAuth.collections.User;
import com.example.crudAuth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class Controller {
    @Autowired
    UserRepository userRepository;
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);

    }
    @GetMapping("/auth")
    public String auth() {
        return "funciona con auth";
    }

    @GetMapping("/no-auth")
    public String noAuth() {
        return "funciona con no auth";
    }
    @GetMapping("/login")
    public String login() {
        return "funciona con login";
    }
    @GetMapping("/role-admin")
    public String roleAdmin() {
        return "funciona con role admin";
    }
    @GetMapping("/role-creator")
    public String roleCreator() {
        return "funciona con role creator";
    }
}
