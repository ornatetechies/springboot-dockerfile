package com.ornate.firstApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApiController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name){
        return String.format("Hello, %s!", name );
    }
}
