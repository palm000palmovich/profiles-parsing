package com.example.weather.service;

import com.example.weather.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("production")
public class WeatherServiceProduction implements WeatherService{
    private static String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid=...";

    Logger logger = LoggerFactory.getLogger(WeatherService.class);

    @Value("&{weather.url}")
    private String weatherUrl;

    @Value("&{weather.api-key}")
    private String weatherApiKey;

    @Autowired
    private RestTemplate restTemplate;   //дает возможность спрингу отправлять запросы в браузер
    @Override
    public Weather getWeather(String city){
        logger.debug("Requesting weather for city: {}", city);
        Weather weather = restTemplate.exchange(weatherUrl,
                HttpMethod.GET,
                new HttpEntity<>(HttpHeaders.EMPTY),
                Weather.class,
                city,
                weatherApiKey
        ).getBody();
        logger.debug("The weather for {} is {}", city, weather);
        return weather;
    }
}
