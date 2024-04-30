 package com.example.Event_Register.controller;

 import com.example.Event_Register.model.Event;
 import com.example.Event_Register.model.EventRequest;
 import com.example.Event_Register.services.interfaces.IEventservice;
 import org.jetbrains.annotations.NotNull;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import java.time.Instant;
 import java.util.List;

@RestController
@RequestMapping ("/Event")
public class Eventcontroller {
    @Autowired
    private IEventservice eventservice;
    private EventRequest Event;
    @GetMapping("/findallevents")
    public List<Event> findAllEvents() {
        return eventservice.getAllEvents();
    }
    @PostMapping("/saveEventInfo")
    public Event saveEvent(@RequestBody @NotNull Event event) {
        event.setTimestamp(Instant.now()); // Set the current timestamp when creating the event
        return eventservice.saveEvent(event);
    }
    @PostMapping("/saveEventWithTemperature")
    public com.example.Event_Register.model.Event saveEventWithTemperature(@RequestBody EventRequest eventRequest) {
        return eventservice.saveEvent(eventRequest);
    }

}