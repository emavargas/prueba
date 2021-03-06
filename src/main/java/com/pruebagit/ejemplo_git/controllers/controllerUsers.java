package com.pruebagit.ejemplo_git.controllers;

import com.pruebagit.ejemplo_git.models.users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controllerUsers {

    @GetMapping("/users")
    public String getUsers(){
        return "todos los usuarios";
    }

    @GetMapping("users/{id}")
    public String getUserById(@PathVariable int id){
        return "Un usuario especifico";
    }
}
