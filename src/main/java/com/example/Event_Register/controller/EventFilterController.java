package com.example.Event_Register.controller;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Eventfilter")
public class EventFilterController {
    @Autowired
    private IEventservice eventservice;

    @GetMapping("/filterAbove37C")
    public List<Event> filterTemperatureAbove35C(){

        return eventservice.getEventAboveTemperature(37.0);
    }
}
