package com.tit.uc5.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // PUT request using path variable and query parameter
    @PutMapping("/put/{firstName}")
    public String greetUser(@PathVariable String firstName,
                            @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
