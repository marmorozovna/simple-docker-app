package ru.morozovna.simpledockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping ("/")
    public String sayHello(){
        return "Hello, Docker!";
    }
}
