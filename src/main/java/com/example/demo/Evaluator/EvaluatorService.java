package com.example.demo.evaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EvaluatorService {

    @Autowired
    EvaluatorRepository evaluatorRepository;
    public List<Evaluator> getEvaluators(){
        return (List<Evaluator>) evaluatorRepository.findAll(); // implemented in the JPARepository
    }
    public Optional<Evaluator> getEvaluator(Long evaluatorId){
        Optional<Evaluator> evaluator = evaluatorRepository.findById(evaluatorId);
        if (!evaluator.isPresent()) {
            throw new IllegalStateException("Evaluator with the Id \""+evaluatorId+"\" was not found");

        }
        return evaluator;
    }


    public void addNewEvaluator(Evaluator evaluator) {
        Optional<Evaluator> evaluatorByEmail = evaluatorRepository.findEvaluatorByEmail (evaluator. getEmail());
        if (evaluatorByEmail.isPresent()) {
            throw new IllegalStateException("email taken");

        }
        evaluatorRepository.save(evaluator) ;


    }

    public void deleteEvaluator(Long evaluatorId) {
        boolean exists=evaluatorRepository.existsById(evaluatorId);
        if(!exists) {
            throw new IllegalStateException(
                    "evaluator with id " + evaluatorId + " does not exist");
        }
        evaluatorRepository.deleteById(evaluatorId) ;

    }



    @Transactional
    public void updateEvaluator(Long evaluatorId,
                              String firstName,
                              String LastName,
                              String email) {
        Evaluator evaluator = evaluatorRepository.findById(evaluatorId)
                .orElseThrow(() -> new IllegalStateException(
                        "evaluator with id " + evaluatorId + " does not exist"));

        if (firstName != null && firstName.length() > 0 && !Objects.equals(evaluator.getFirstName(), firstName) &&
                LastName != null && LastName.length() > 0 && !Objects.equals(evaluator.getLastName(), LastName)) {

            evaluator.setFirstName(firstName);
            evaluator.setLastName(LastName);

            if (email != null &&
                    email.length() > 0 &&
                    !Objects.equals(evaluator.getEmail(), email)) {
                Optional<Evaluator> evaluatorOptional = evaluatorRepository
                        .findEvaluatorByEmail(email);
                if (evaluatorOptional.isPresent()) {
                    throw new IllegalStateException("email taken");
                }
                evaluator.setEmail(email);

            }
        }
    }


}
