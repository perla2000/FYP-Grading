package com.example.demo.assessment;

import com.example.demo.competence.Competence;
import com.example.demo.competence.CompetenceRepository;
import com.example.demo.evaluator.Evaluator;
import com.example.demo.evaluator.EvaluatorRepository;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service //@Component   //to use Autowired @Service or @Component are the same thing
public class AssessmentService {

    @Autowired
    private final AssessmentRepository assessmentRepository;
    @Autowired
    private final CompetenceValueRepository competenceValueRepository;
    @Autowired
    private final CompetenceRepository competenceRepository;

    @Autowired
    private final EvaluatorRepository evaluatorRepository;
    @Autowired
    private final StudentRepository studentRepository;

    public AssessmentService(AssessmentRepository assessmentRepository, CompetenceValueRepository competenceValueRepository, CompetenceRepository competenceRepository, EvaluatorRepository evaluatorRepository, StudentRepository studentRepository) {
        this.assessmentRepository = assessmentRepository;
        this.competenceValueRepository = competenceValueRepository;

        this.competenceRepository = competenceRepository;
        this.evaluatorRepository = evaluatorRepository;
        this.studentRepository = studentRepository;
    }

    public List<Assessment> getSheets() {
        return assessmentRepository.findAll();
    }
    public Optional<Assessment> getSheet(Long sheetId){
        Optional<Assessment> sheet = assessmentRepository.findById(sheetId);
        if (!sheet.isPresent()) {
            throw new IllegalStateException("Group with the Id \""+sheetId+"\" was not found");

        }
        return sheet;
    }

    public void deleteSheet(Long sheetId) {
        boolean exists=assessmentRepository.existsById(sheetId);
        if(!exists) {
            throw new IllegalStateException(
                    "Sheet with id " + sheetId + " does not exist");
        }
        assessmentRepository.deleteById(sheetId) ;

    }
    public void createSheet(List<String> competenceList, List<String> valueList,
                            String description, String evaluatorId,Double poids,String studentId)
    {
        Assessment sheet = new Assessment();
        List<CompetenceValue> competenceValues = new ArrayList<>();
        Set<Long> competenceListLong = competenceList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
        int i=0;
        Double value=0.0;
        Double TotalGrade=0.0;
        for (Long id : competenceListLong)
        {
            Optional<Competence> competence = competenceRepository.findById(id);
            value= Double.valueOf(valueList.get(i));
            TotalGrade+=value;
            CompetenceValue compValue=new CompetenceValue(competence.get(),value);
            competenceValueRepository.save(compValue);
            competenceValues.add(compValue);
            ++i;

        }
        Optional<Evaluator> evaluator=evaluatorRepository.findById(Long.valueOf(evaluatorId));
        Optional<Student> student=studentRepository.findById(Long.valueOf(studentId));
        sheet.setTotalGrade(TotalGrade/(competenceValues.size()));
        sheet.setCompetences(competenceValues);
        sheet.setDescription(description);
        sheet.setEvaluator(evaluator.get());
        sheet.setStudent(student.get());
        sheet.setPoids(poids);
        assessmentRepository.save(sheet);

    }




    }




//  @Transactional
//    public void updateGroup(Long groupId, String description, Long studentId){
//        Group group = groupRepository.findById(groupId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "group with id " + groupId + " does not exist"));
//
//
//        if (description != null && description.length() > 0 && !Objects.equals(group.getDescription(), description)) {
//
//            group.setDescription(description);}
//        Optional<Student> studentToUpdate=studentRepository.findById(studentId);
//        if (!studentToUpdate.isPresent()) {
//                throw new IllegalStateException("Student with the Id \""+groupId+"\" was not found");
//            }
//        else{
//            List<Student> students=group.getStudents();
//
//            if ( students!= null && students.size() > 0 ){
//                for (int i=0;i<students.size();++i){
//                    if (Objects.equals(students.get(i), studentRepository.findById(studentId))){
//                        students.remove(i);
//                        students.add(i,studentToUpdate);
//
//                    }
//                    else{
//                    group.setStudents(students.add(students.add(studentService.getStudent(studentId))));
//                    }
//                }
//                Optional<Group> group = groupRepository
//                        .findGroupByEmail(email);
//                if (GroupOptional.isPresent()) {
//                    throw new IllegalStateException("email taken");
//                }
//                group.setEmail(email);
//
//            }
//
//    }

