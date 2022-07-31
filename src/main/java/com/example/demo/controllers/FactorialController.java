package com.example.demo.controllers;

import com.example.demo.services.ServiceFactorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FactorialController {

    @Autowired
    private ServiceFactorial service;

    @GetMapping("/factorial/{n}")
    public int mathFactorial(@PathVariable(value = "n", required = true) int n){
        return service.factorialMethod(n);
    }
}
