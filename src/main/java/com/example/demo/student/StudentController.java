package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired //this student service should be autowired for us and then injected
    public  StudentController(StudentService studentService){
        this.studentService=studentService;
                //new StudentService(); we shouldn't use this so we use annotations for injection
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
