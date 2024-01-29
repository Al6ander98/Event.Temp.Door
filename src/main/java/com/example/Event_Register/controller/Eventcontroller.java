package com.example.Event_Register.controller;

import com.example.Event_Register.model.Event;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(/"event")
public class Eventcontroller {
    @Autowired
    private IEventservice eventservice;

    public Eventcontroller(IEventservice eventservice) {
        this.eventservice = eventservice;
    }
}
@GetMapping
public List<Event> findAllEvents(){
    List<Event> allEvents = IEventservice
}
//@RestController("/book")
//public class BookController {
//    private BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }

//@GetMapping
//public List<Book> findAllBooks(){
//    List<Book> allBooks = bookService.getAllBooks();
//    return allBooks;
//}
//
//@PostMapping
//public Book createBook(@RequestBody Book incomingBook){
//    Book savedBook = bookService.createBook(incomingBook);
//    return savedBook;
//}
//
//@PutMapping
//public Book updateBook(@RequestBody Book bookToBeUpdated){
//    Book updatedBook = bookService.updateBook(bookToBeUpdated);
//    return updatedBook;
//}