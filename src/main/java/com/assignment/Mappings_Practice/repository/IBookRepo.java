package com.assignment.Mappings_Practice.repository;

import com.assignment.Mappings_Practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {
}
