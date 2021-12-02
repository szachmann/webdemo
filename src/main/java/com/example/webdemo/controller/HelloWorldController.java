package com.example.webdemo.controller;

import com.example.webdemo.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello_world(){
        return "test text";
    }

    @RequestMapping("/test2")
    public Person hello_world2(){
        Person p = new Person();
        p.setFirstName("Joe");
        p.setLastName("Johnson");
        p.setAge(42);
        return p;
    }
}
