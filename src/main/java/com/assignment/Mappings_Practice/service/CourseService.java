package com.assignment.Mappings_Practice.service;

import com.assignment.Mappings_Practice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;
}
