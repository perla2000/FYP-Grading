package com.example.demo.evaluator;


import com.example.demo.student.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EvaluatorRepository extends CrudRepository<Evaluator , Long> {
    Optional<Evaluator> findEvaluatorByEmail(String email);


}
