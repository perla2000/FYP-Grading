package com.example.demo.grading;

import com.example.demo.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//long because id is long
//Student type that we want to work upon
@Repository
public interface GradingRepository extends JpaRepository<Grading, Long > {
    Optional<Grading> findGradingByStudentId(Long studentId);

}
