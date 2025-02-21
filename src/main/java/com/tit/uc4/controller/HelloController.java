package com.tit.uc4.controller;

import com.tit.uc4.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // POST request to greet user using JSON body
    @PostMapping("/post")
    public String greetUser(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
