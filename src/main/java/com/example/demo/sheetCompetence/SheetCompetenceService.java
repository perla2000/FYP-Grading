//package com.example.demo.sheetCompetence;
//
//
//import com.example.demo.assessments.AssessmentRepository;
//import com.example.demo.competence.CompetenceRepository;
//import com.example.demo.evaluator.Evaluator;
//import com.example.demo.evaluator.EvaluatorRepository;
//import com.example.demo.group.Group;
//import com.example.demo.group.GroupRepository;
//import com.example.demo.student.Student;
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
//public class SheetCompetenceService {
//    @Autowired
//    private final SheetCompetenceRepository sheetRepository;
//    @Autowired
//    private final AssessmentRepository assessmentRepository;
//
//
//    public SheetCompetenceService(GroupRepository groupRepository, CompetenceRepository competenceRepository, StudentRepository studentRepository, EvaluatorRepository evaluatorRepository, SheetCompetenceRepository sheetRepository, AssessmentRepository assessmentRepository){
//        this.sheetRepository = sheetRepository;
//
//        this.assessmentRepository = assessmentRepository;
//
//    }
//
//    public List<SheetCompetence> getSheets() {
//        return sheetRepository.findAll();
//    }
//    public Optional<SheetCompetence> getSheet(Long sheetId){
//        Optional<SheetCompetence> sheet = sheetRepository.findById(sheetId);
//        if (!sheet.isPresent()) {
//            throw new IllegalStateException("Group with the Id \""+sheetId+"\" was not found");
//
//        }
//        return sheet;
//    }
//
//    public void deleteSheet(Long sheetId) {
//        boolean exists=sheetRepository.existsById(sheetId);
//        if(!exists) {
//            throw new IllegalStateException(
//                    "Sheet with id " + sheetId + " does not exist");
//        }
//        sheetRepository.deleteById(sheetId) ;
//
//    }
//    public void createSheet(List<String> competenceIdList, List<String> assessmentIdList)
//    {
//        Group group = new Group();
//        List<Evaluator> competenceList = new ArrayList<>();
//        List<Student> studentGroups = new ArrayList<>();
//        Set<Long> evaluatorIdListLong = competenceIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
//        for (Long id : evaluatorIdListLong)
//        {
//            Optional<Evaluator> evaluator = competenceRepository.findById(id);
//            competenceList.add(evaluator.get());
//
//        }
//        Set<Long> studentGroupIdListLong = assessmentIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
//        for (Long id : studentGroupIdListLong){
//            Optional<Student> student =assessmentRepository.findById(id);
//            studentGroups.add(student.get());
//
//        }
//        sheet.setCompetences(evaluators);
//        sheet.setStudents(studentGroups);
//        sheet=sheetRepository.save(sheet);
//        sheetRepository.save(sheet);
////
////        return group;
//    }
//
//
//
//
//    }
//
//
//
//
////  @Transactional
////    public void updateGroup(Long groupId, String description, Long studentId){
////        Group group = groupRepository.findById(groupId)
////                .orElseThrow(() -> new IllegalStateException(
////                        "group with id " + groupId + " does not exist"));
////
////
////        if (description != null && description.length() > 0 && !Objects.equals(group.getDescription(), description)) {
////
////            group.setDescription(description);}
////        Optional<Student> studentToUpdate=studentRepository.findById(studentId);
////        if (!studentToUpdate.isPresent()) {
////                throw new IllegalStateException("Student with the Id \""+groupId+"\" was not found");
////            }
////        else{
////            List<Student> students=group.getStudents();
////
////            if ( students!= null && students.size() > 0 ){
////                for (int i=0;i<students.size();++i){
////                    if (Objects.equals(students.get(i), studentRepository.findById(studentId))){
////                        students.remove(i);
////                        students.add(i,studentToUpdate);
////
////                    }
////                    else{
////                    group.setStudents(students.add(students.add(studentService.getStudent(studentId))));
////                    }
////                }
////                Optional<Group> group = groupRepository
////                        .findGroupByEmail(email);
////                if (GroupOptional.isPresent()) {
////                    throw new IllegalStateException("email taken");
////                }
////                group.setEmail(email);
////
////            }
////
////    }
//
