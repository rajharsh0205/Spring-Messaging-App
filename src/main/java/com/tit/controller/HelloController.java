package com.tit.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request using path variable
    @GetMapping("/param/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}