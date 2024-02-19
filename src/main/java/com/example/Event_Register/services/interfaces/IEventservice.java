package com.example.Event_Register.services.interfaces;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.model.EventRequest;

import java.util.List;

public interface IEventservice {
    Event saveEvent( EventRequest eventRequest);
    List<Event> saveEvent(List<EventRequest> eventRequest);
    List<Event> getEventAboveTemperature(double temperature);
    List<Event> getAllEvents();
}
