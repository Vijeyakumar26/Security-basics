package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping(path = "/")
    public String simpleGet()
    {
        return "Welcome with Security!";
    }
}
