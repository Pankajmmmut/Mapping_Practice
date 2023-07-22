package com.assignment.Mappings_Practice.repository;

import com.assignment.Mappings_Practice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
