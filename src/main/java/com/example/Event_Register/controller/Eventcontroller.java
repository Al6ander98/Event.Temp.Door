package com.example.Event_Register.controller;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.model.EventRequest;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Event") // Adjusted the mapping to be more RESTful
public class Eventcontroller {
        @Autowired
    private IEventservice eventservice;
    private EventRequest Event;

    //   public Eventcontroller(IEventservice eventservice) {
   //     this.eventservice = eventservice;
  //  }

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
        eventservice.saveEvent(Event );
    }

    @PostMapping("/saveWithTemperature")
    public String saveEventWithTemperature(@RequestBody EventRequest eventRequest) {
        eventservice.saveEvent(eventRequest);
        return null;
    }
}

