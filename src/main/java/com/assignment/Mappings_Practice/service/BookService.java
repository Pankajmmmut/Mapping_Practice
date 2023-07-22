package com.assignment.Mappings_Practice.service;

import com.assignment.Mappings_Practice.model.Book;
import com.assignment.Mappings_Practice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book) ;
        return "book added.";
    }

    public Iterable getAllBooks() {
        return bookRepo.findAll();
    }

    public String deleteBookbyId(Long bookId) {
        bookRepo.deleteById(bookId);
        return "deleted : "+bookId;
    }
}
