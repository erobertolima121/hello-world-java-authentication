package com.robjava.demo.helloworldauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Esta é a pasta raiz, ajuste sua rota!\n";
    }
    @RequestMapping("/hello")
    public String index2() {

        return "Hello, World!\n";
    }

}
