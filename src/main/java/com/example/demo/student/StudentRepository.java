package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//long because id is long
//Student type that we want to work upon
@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {
}
