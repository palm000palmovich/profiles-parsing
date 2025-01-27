package com.example.weather.model;

public class Weather {
    private WeatherMain main;
    private WeartherWind wind;

    public Weather(){}

    //Getters and setters

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public WeartherWind getWind() {
        return wind;
    }

    public void setWind(WeartherWind wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "main=" + main +
                ", wind=" + wind +
                '}';
    }
}
