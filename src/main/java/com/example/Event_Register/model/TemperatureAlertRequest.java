package com.example.Event_Register.model;

import jakarta.persistence.Entity;

@Entity
public class TemperatureAlertRequest {
    private double threshold;

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}