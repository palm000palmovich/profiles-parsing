package com.example.weather.model;

import java.math.BigDecimal;

public class WeartherWind {
    private BigDecimal speed;
    private Integer deg;

    public WeartherWind(){}

    //Getters and Setters

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "WeartherWind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}
