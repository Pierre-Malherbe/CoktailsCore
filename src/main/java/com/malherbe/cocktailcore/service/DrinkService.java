package com.malherbe.cocktailcore.service;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    public void ActivateDrink(String pinSelected) throws InterruptedException {
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, PinState.LOW);
        pin.setState(true);
        Thread.sleep(2000);
        pin.setState(false);
        Thread.sleep(2000);
        pin.setState(true);
        Thread.sleep(2000);
        pin.setState(false);
        Thread.sleep(2000);
        gpio.shutdown();
    }

    public void DesactivateDrink(String pin) {

    }
}
