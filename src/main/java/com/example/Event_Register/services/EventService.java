package com.example.Event_Register.services;
// EventService.java
import com.example.Event_Register.model.Event;
import com.example.Event_Register.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent(Event event) {
        // Implement logic to save the event with UTC timestamp
        event.setTimestamp(Instant.now());
        return eventRepository.save(event);
    }
}
