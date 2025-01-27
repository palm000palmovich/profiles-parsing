package com.example.weather.service;

import com.example.weather.model.WeartherWind;
import com.example.weather.model.Weather;
import com.example.weather.model.WeatherMain;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Profile("!production")
public class WeatherServiceTest implements  WeatherService{

    @Override
    public Weather getWeather(String city){
        Weather weather = new Weather();
        WeatherMain weatherMain = new WeatherMain();
        weatherMain.setTemp(BigDecimal.ONE);
        weatherMain.setHumidity(BigDecimal.ONE);

        WeartherWind weatherWind = new WeartherWind();
        weatherWind.setDeg(1);
        weatherWind.setSpeed(BigDecimal.ONE);

        weather.setMain(weatherMain);
        weather.setWind(weatherWind);
        return weather;
    }
}
