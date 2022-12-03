package com.example.demo.assessment;

import com.example.demo.evaluator.Evaluator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//long because id is long
//Student type that we want to work upon
@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long > {
List<Assessment> findByStudentId(Long studentId);
}
