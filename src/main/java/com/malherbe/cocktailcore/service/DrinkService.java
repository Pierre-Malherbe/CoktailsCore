package com.malherbe.cocktailcore.service;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    public void ActivateDrink(String pinSelected) throws InterruptedException {
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, PinState.LOW);
        pin.high();
        System.out.println("Pin High");
        Thread.sleep(2000);
        // turn off and wait 2 seconds
        pin.low();
        System.out.println("Pin Low");
        Thread.sleep(2000);

        // turn pin on for 2 second and then off
        System.out.println("Pin High for 2 seconds");
        pin.pulse(2000, true);
        gpio.shutdown();
    }

    public void DesactivateDrink(String pin) {

    }
}
