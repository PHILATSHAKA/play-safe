package com.playsafe.phila.service.impl;

import com.playsafe.phila.service.PlaySafeService;
import org.springframework.stereotype.Component;

@Component
public class PlaySafeServiceImpl implements PlaySafeService {
    private final static float FAHRENHEIT = 273.15F;

    @Override
    public float kelvinToCelsius(float kelvin) {
        return kelvin - FAHRENHEIT;
    }

    @Override
    public float celsiusToKelvin(float celsius) {
        return celsius + FAHRENHEIT;
    }

    @Override
    public double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    @Override
    public double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

}
