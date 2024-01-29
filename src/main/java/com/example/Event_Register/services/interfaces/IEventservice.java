package com.example.Event_Register.services.interfaces;

import com.example.Event_Register.model.Event;

import java.util.List;

public interface IEventservice {
    public Event saveEvent(Event event);
    List<Event> getAllEvents();
}


//VB
//public interface BookService {
//    Book createBook(Book incomingBook);
//    List<Book> getAllBooks();
//    Book updateBook(Book toBeUpdatedBook);
//
//}