package com.example.weather.controller;

import com.example.weather.model.Weather;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("production")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(path = "/weather/{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable("city") String city){
        Weather weather = weatherService.getWeather(city);
        return ResponseEntity.ok(weather);
    }
}
