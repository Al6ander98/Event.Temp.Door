package com.example.Event_Register.services;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.model.EventRequest;
import com.example.Event_Register.repositories.EventRepository;
import com.example.Event_Register.services.interfaces.IEventservice;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventservice {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public Event saveEvent(EventRequest eventRequest) {
        // Check if event with same temperature already exists
        List<Event> existingEvents = eventRepository.findByTemperatureGreaterThan(eventRequest.getTemperatureInCelsius());
        if (!existingEvents.isEmpty()) {
            // Update existing event
            Event existingEvent = existingEvents.get(0); // Assuming only one event for simplicity
            existingEvent.setTimestamp(Instant.now()); // Update timestamp
            return eventRepository.save(existingEvent);
        } else {
            // Create new event
            Event newEvent = new Event();
            newEvent.setTemperatureCelsius(eventRequest.getTemperatureInCelsius());
            newEvent.setTimestamp(Instant.now());
            return eventRepository.save(newEvent);
        }
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event saveEvent(Event event) {
        return null;
    }

    @Override
    public void saveEvent(List<EventRequest> eventRequests) {
        List<Event> savedEvents = new ArrayList<>();
        for (EventRequest eventRequest : eventRequests) {
            Event event = new Event();
            event.setTemperatureCelsius(eventRequest.getTemperatureInCelsius());
            event.setTimestamp(Instant.now()); // Set the current timestamp
            savedEvents.add(eventRepository.save(event));
        }
    }

    @Override
    public List<Event> getEventAboveTemperature(double temperature) {
        return eventRepository.findByTemperatureGreaterThan(temperature);
    }

    // Assuming you have a method to send an internal notification
    void sendInternalNotification(String recipientEmail, String message) {
        // Implement logic to send notification within your application
        // (e.g., logging, triggering internal events)
    }

    @Override
    public void sendTemperatureAlertEmail(double temperature) {
        MimeMessage message = javaMailSender.createMimeMessage(); // Optional for logging purposes
        // Configure message content (optional for logging)
        String htmlContent = "<h2>Temperature Alert!</h2><p>The temperature is above " + temperature + " Celsius.</p>";
        // ... (rest of the code for sending email via SMTP, if needed)

        // Send internal notification (assuming recipient is event.register@yourcompany.com)
        sendInternalNotification("eventregister72@gmail.com", htmlContent);
    }


}
