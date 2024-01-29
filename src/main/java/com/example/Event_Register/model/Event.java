package com.example.Event_Register.model;
// Event.java
import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperature;

    @Column(columnDefinition = "TIMESTAMP")
    private Instant timestamp;

    public void setTimestamp(Instant now) {
    }

    // getters and setters
}
