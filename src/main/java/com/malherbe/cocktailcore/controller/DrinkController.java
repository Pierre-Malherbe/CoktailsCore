package com.malherbe.cocktailcore.controller;

import com.malherbe.cocktailcore.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {

    private DrinkService service;

    @GetMapping("/")
    public String works() {
        return "works";
    }

    @GetMapping("/pin/activate/{pin}")
    public String activatePin(@PathVariable String pin) throws InterruptedException {
        service.ActivateDrink(pin);
        return "Pin number " +pin + "is activated";
    }

    @GetMapping("/pin/desactivate/{pin}")
    public String desactivatePin(@PathVariable String pin) {

        return "Pin number " +pin + "is desactivate";
    }

    @Autowired
    public DrinkController setService(DrinkService service) {
        this.service = service;
        return this;
    }
}
