package com.example.Event_Register.services;
// EventService.java
import com.example.Event_Register.model.Event;
import com.example.Event_Register.model.EventRequest;
import com.example.Event_Register.repositories.EventRepository;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class EventService implements IEventservice {
    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent(EventRequest eventRequest) {
        Event incomingEvent = new Event();
        double temperatureCelsius = eventRequest.getTemperatureInCelsius();
        incomingEvent.setTemperatureCelsius(temperatureCelsius);
        incomingEvent.setTimestampInUTC();
        return eventRepository.save(incomingEvent);
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }
}
