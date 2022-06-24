package com.example.crudAuth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class Controller {
    @GetMapping("/auth")
    public String auth() {
        return "funciona con auth";
    }

    @GetMapping("/no-auth")
    public String noAuth() {
        return "funciona con no auth";
    }
}
