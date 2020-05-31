package com.playsafe.phila.controller;

import com.playsafe.phila.service.PlaySafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("conversions")
@RestController
public class PlaySafeController {

     @Autowired
     private PlaySafeService playSafeService;

    @RequestMapping(value = "/ktoc")
    public float getKelvinToCelsius(@RequestParam("kelvin") float kelvin){
        if (playSafeService != null){
            return playSafeService.kelvinToCelsius(kelvin);
        }
        return (float) 0;
    }

    @RequestMapping(value = "/ctok")
    public float getCelsiusToKelvin(@RequestParam("celsius") float celsius){
        if (playSafeService != null){
            return playSafeService.celsiusToKelvin(celsius);
        }
        return (float) 0;
    }

    @RequestMapping(value = "/mtok")
    public double getMilesToKilometers(@RequestParam("miles") double miles){
        if (playSafeService != null){
            return playSafeService.milesToKilometers(miles);
        }
        return 0;
    }

    @RequestMapping(value = "/ktom")
    public double getKilometersToMiles(@RequestParam("kilometers") double kilometers){
        if (playSafeService != null){
            return playSafeService.kilometersToMiles(kilometers);
        }
        return 0;
    }
}
