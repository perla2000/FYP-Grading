package com.example.demo.competence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service //@Component   //to use Autowired @Service or @Component are the same thing
public class CompetenceService {
    @Autowired
    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public List<Competence> getCompetences(){
            return competenceRepository.findAll();
    }
    public Optional<Competence> getCompetence(Long competenceId){
        Optional<Competence> competence = competenceRepository.findById(competenceId);
        if (!competence.isPresent()) {
            throw new IllegalStateException("Student with the Id \""+competenceId+"\" was not found");

        }
        return competence;
    }

    public void addNewCompetence(Competence competence) {

        competenceRepository.save(competence) ;


    }

    public void deleteCompetence(Long studentId) {
        boolean exists=competenceRepository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException(
                    "student with id " + studentId + " does not exist");
        }
        competenceRepository.deleteById(studentId) ;

    }



    @Transactional
    public void updateCompetence(Long competenceId,
                              String description,
                              Integer value,
                              Integer poids) {
        Competence student = competenceRepository.findById(competenceId)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + competenceId + " does not exist"));

        if (description != null && description.length() > 0 && !Objects.equals(student.getDescription(), description)) {

            student.setDescription(description);}

        if (value != null && value > 0 && !Objects.equals(student.getValue(), value)) {
                student.setValue(value);
            }
        if (poids != null && poids > 0 && !Objects.equals(student.getPoids(), poids)) {
            student.setPoids(poids);
        }
        }
    }

