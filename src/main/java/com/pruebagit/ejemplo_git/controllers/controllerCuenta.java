package com.pruebagit.ejemplo_git.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@RestController

public class controllerCuenta {

    @GetMapping("/cuenta")
    public String getCuentas() {
        return "Todas las cuentas";
    }

}
