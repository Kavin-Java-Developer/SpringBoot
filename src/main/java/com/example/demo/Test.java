package com.example.demo;

import org.springframework.web.bind.annotation.*;


@RestController
public class Test {

    @GetMapping("/test")
    public String initial(){
        return "API is working";
    }

    @PostMapping("/")
    public User addData(@RequestBody User userData){
        return userData;
    }
}

class User{
    public String name;

    public String email;
    public int age;

}