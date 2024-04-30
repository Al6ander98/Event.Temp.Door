package com.example.Event_Register.repositories;

import com.example.Event_Register.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.Instant;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom queries can be added here if needed
    @Query("SELECT e FROM Event e WHERE e.temperatureCelsius > :temperature")
    List<Event> findByTemperatureGreaterThan(double temperature);

    @Query("SELECT e FROM Event e WHERE e.timestamp > :timestamp")
    List<Event> findByTimestampAfter(Instant timestamp);
}
