package com.example.demo.assessment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//long because id is long
//Student type that we want to work upon
@Repository
public interface CompetenceValueRepository extends JpaRepository<CompetenceValue, Long > {

}
