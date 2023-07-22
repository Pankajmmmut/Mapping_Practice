package com.assignment.Mappings_Practice.service;

import com.assignment.Mappings_Practice.model.Student;
import com.assignment.Mappings_Practice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "a student added. ";
    }

    public Iterable getAllStudents() {
        return studentRepo.findAll();
    }


    public String deleteStudentbyId(Long studentId) {
        studentRepo.deleteById(studentId);
        return "A student deleted of id "+studentId;
    }
}
