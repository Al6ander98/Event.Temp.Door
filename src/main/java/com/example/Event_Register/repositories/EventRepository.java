package com.example.Event_Register.repositories;
// EventRepository.java
import com.example.Event_Register.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom queries can be added here if needed
}
