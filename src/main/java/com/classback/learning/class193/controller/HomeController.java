package com.classback.learning.class193.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@RequestMapping("/test")
public String index(){
    return "HELLO WORLD!!!!!!";
}


    
}