package com.assignment.Mappings_Practice.controller;

import com.assignment.Mappings_Practice.model.Book;
import com.assignment.Mappings_Practice.model.Student;
import com.assignment.Mappings_Practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("books")
    public Iterable getAllBooks(){
        return bookService.getAllBooks();
    }


    @DeleteMapping("book/{bookId}")
    public String deleteBookbyId(@PathVariable Long bookId){
        return bookService.deleteBookbyId(bookId);
    }
}
