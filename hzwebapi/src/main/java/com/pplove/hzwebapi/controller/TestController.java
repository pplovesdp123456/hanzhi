package com.pplove.hzwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getHello")
    public String getHello(){
        return "hello";
    }
}
