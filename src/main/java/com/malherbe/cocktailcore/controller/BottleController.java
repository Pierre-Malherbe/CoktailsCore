package com.malherbe.cocktailcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BottleController {

    @GetMapping("/")
    public String works() {
        return "works";
    }
}
