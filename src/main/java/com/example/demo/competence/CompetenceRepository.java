package com.example.demo.competence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//long because id is long
//Student type that we want to work upon
@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long > {


    Optional<Competence> findById(Long id);


}
