package com.example.demo.assessments;

import com.example.demo.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//long because id is long
//Student type that we want to work upon
@Repository
public interface AssessmentRepository extends JpaRepository<Group, Long > {





}
