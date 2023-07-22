package com.assignment.Mappings_Practice.repository;

import com.assignment.Mappings_Practice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,Long> {
}
