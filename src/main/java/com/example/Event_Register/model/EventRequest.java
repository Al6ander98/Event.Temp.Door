package com.example.Event_Register.model;

public class EventRequest {
    private double temperatureInCelsius;

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public EventRequest(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }
}

