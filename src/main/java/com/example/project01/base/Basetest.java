package com.example.project01.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Basetest {

    @GetMapping("")
    public String hello(){
        return "hello";
    }
}
