package com.example.Event_Register.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private Long id;  // If you decide to use it, uncomment and use it as needed

    

    public void setTimestampInUTC() {
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
    }

    public void setTimestamp(Instant now) {
    }
}
