package com.example.Event_Register.services.interfaces;
import com.example.Event_Register.model.Event;
import com.example.Event_Register.model.EventRequest;
import java.util.List;

public interface IEventservice {
    Event saveEvent( EventRequest eventRequest);
    void saveEvent(List<EventRequest> eventRequest);
    List<Event> getEventAboveTemperature(double temperature);
    List<Event> getAllEvents();
    Event saveEvent(Event event);
    // New method for sending email notifications
    void sendTemperatureAlertEmail(double threshold);
}
