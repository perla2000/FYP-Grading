//package com.example.demo.jury;
//
//
//import com.example.demo.evaluator.Evaluator;
//import com.example.demo.evaluator.EvaluatorRepository;
//import com.example.demo.group.Group;
//import com.example.demo.student.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service //@Component   //to use Autowired @Service or @Component are the same thing
//public class JuryService {
//    @Autowired
//    private final JuryRepository juryRepository;
//
//    @Autowired
//    private final EvaluatorRepository evaluatorRepository;
//
//
//
//    public JuryService(JuryRepository juryRepository, EvaluatorRepository evaluatorRepository){
//        this.juryRepository = juryRepository;
//
//        this.evaluatorRepository = evaluatorRepository;
//    }
//
//    public List<Jury> getJuries() {
//        return juryRepository.findAll(); // implemented in the JPARepository
//    }
//    public Optional<Jury> getJury(Long juryId){
//        Optional<Jury> group = juryRepository.findById(juryId);
//        if (!group.isPresent()) {
//            throw new IllegalStateException("Group with the Id \""+juryId+"\" was not found");
//
//        }
//        return group;
//    }
//
//
//
//    public void deleteJury(Long juryId) {
//        boolean exists=juryRepository.existsById(juryId);
//        if(!exists) {
//            throw new IllegalStateException(
//                    "group with id " + juryId + " does not exist");
//        }
//        juryRepository.deleteById(juryId) ;
//
//    }
//    public Jury createJury(List<String> evaluatorIdList)//, List<String> studentGroupIdList)
//    {
//        Jury jury = new Jury();
//        List<Evaluator> evaluators = new ArrayList<>();
////        List<Group> studentGroups = new ArrayList<>();
//        Set<Long> evaluatorIdListLong = evaluatorIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
//        for (Long id : evaluatorIdListLong)
//        {
//            Optional<Evaluator> evaluator = evaluatorRepository.findById(id);
//            evaluators.add(evaluator.get());
//
//        }
////        Set<Long> studentGroupIdListLong = studentGroupIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
////        for (Long id : studentGroupIdListLong){
////            Optional<Jury> jury1 =juryRepository.findById(id);
////            studentGroups.add(jury1.get());
////
////        }
//        jury.setEvaluatorList(evaluators);
////        jury.setStudentGroupList(studentGroups);
//        jury=juryRepository.save(jury);
//
//        return jury;
//    }
//
//}
