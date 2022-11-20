package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//long because id is long
//Student type that we want to work upon
@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {
  //  @Query( "SELECT * FROM Student WHERE email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
