package com.assignment.Mappings_Practice.controller;

import com.assignment.Mappings_Practice.model.Student;
import com.assignment.Mappings_Practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("students")
    public Iterable getAllStudents(){
        return studentService.getAllStudents();
    }


    @DeleteMapping("student/{studentId}")
    public String deleteStudentbyId(@PathVariable Long studentId){
        return studentService.deleteStudentbyId(studentId);
    }

}
