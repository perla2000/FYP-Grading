package com.example.demo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //@Component   //to use Autowired @Service or @Component are the same thing
public class StudentService {
    public List<Student> getStudents(){
            return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.iskandar@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
            );
    }
}
