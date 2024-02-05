package com.example.Event_Register.controller;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Event") // Adjusted the mapping to be more RESTful
public class Eventcontroller {
        @Autowired
    private IEventservice eventservice;

    public Eventcontroller(IEventservice eventservice) {
        this.eventservice = eventservice;
    }

    @GetMapping
    public List<Event> findAllEvents() {
        return eventservice.getAllEvents();
    }

    @PostMapping("/save")
    public void saveEvent(@RequestBody Event event) {
        // Assuming the Event model has fields for timestamps and temperature
        // Save timestamps in UTC format
        event.setTimestampInUTC();

        // Save the event with timestamps
        eventservice.saveEvent(event);
    }

    @PostMapping("/saveWithTemperature")
    public void saveEventWithTemperature(@RequestBody Event event, @RequestParam double temperatureCelsius) {
        /*
         Assuming the Event model has fields for timestamps and temperature
         Save timestamps in UTC format
        */
        event.setTimestampInUTC();

        // Save temperature in Celsius
        event.setTemperatureCelsius(temperatureCelsius);

        // Save the event with timestamps and temperature
        eventservice.saveEvent(event);
    }
}

