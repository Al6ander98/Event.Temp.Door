package com.example.Event_Register.model;
import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class EventRequest {
    private double temperatureInCelsius;
    private Instant timestamp;
    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }
    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    public EventRequest() {
    }
    public EventRequest(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;

    }
}


