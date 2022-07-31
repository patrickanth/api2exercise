package com.example.demo.services;

@org.springframework.stereotype.Service
public class ServiceFactorial {

    public int factorialMethod(int n){
        if (n <= 2){
            return n;
        }
        return n = factorialMethod(n - 1);
    }
}
