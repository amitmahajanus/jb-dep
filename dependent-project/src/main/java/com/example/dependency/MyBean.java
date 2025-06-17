package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String sayHello() {
        return "Hello from MyBean!";
    }
}
