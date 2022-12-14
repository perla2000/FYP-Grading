package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/student")
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
    @GetMapping(path="{studentId}")
    public Optional<Student> getStudent(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){  //we take the request body and map it into the student
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String LastName,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, firstName,LastName,email);
    }

    }
