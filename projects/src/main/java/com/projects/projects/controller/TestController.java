package com.projects.projects.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/example")
public class TestController 
{

    @GetMapping("/hello-world")
    public ResponseEntity<String> get()
    {
        System.out.println("Testing API");
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/get-result")
    public String getResult(){
        return "This is my first application in Spring Boot";
    }
    
}
