package com.example.demo.group;



import com.example.demo.evaluator.Evaluator;
import com.example.demo.evaluator.EvaluatorRepository;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service //@Component   //to use Autowired @Service or @Component are the same thing
public class GroupService {
    @Autowired
    private final GroupRepository groupRepository;
    @Autowired
    private final StudentRepository studentRepository;
    @Autowired
    private final EvaluatorRepository evaluatorRepository;
//    @Autowired
//    private final StudentRepository studentRepository;
//    @Autowired
//    private final StudentService studentService;


    public GroupService(GroupRepository groupRepository, StudentRepository studentRepository, EvaluatorRepository evaluatorRepository){//, StudentRepository studentRepository, StudentService studentService) {
        this.groupRepository = groupRepository;
//        this.studentRepository = studentRepository;
//        this.studentService = studentService;
        this.studentRepository = studentRepository;
        this.evaluatorRepository = evaluatorRepository;
    }

    public List<Group> getGroups() {
        return groupRepository.findAll(); // implemented in the JPARepository
    }
    public Optional<Group> getGroup(Long groupId){
        Optional<Group> group = groupRepository.findById(groupId);
        if (!group.isPresent()) {
            throw new IllegalStateException("Group with the Id \""+groupId+"\" was not found");

        }
        return group;
    }


//    public void addNewGroup(Group group) {
////        Optional<Group> groupByDescription = groupRepository.findGroupByDesc (group. getDescription());
////        if (groupByDescription.isPresent()) {
////            throw new IllegalStateException("group belong to another group");
////        }
//        groupRepository.save(group) ;
//        }
    public void deleteGroup(Long groupId) {
        boolean exists=groupRepository.existsById(groupId);
        if(!exists) {
            throw new IllegalStateException(
                    "group with id " + groupId + " does not exist");
        }
        groupRepository.deleteById(groupId) ;

    }
    public void createGroup(List<String> evaluatorIdList, List<String> studentGroupIdList)
    {
        Group group = new Group();
        List<Evaluator> evaluators = new ArrayList<>();
        List<Student> studentGroups = new ArrayList<>();
        Set<Long> evaluatorIdListLong = evaluatorIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
        for (Long id : evaluatorIdListLong)
        {
            Optional<Evaluator> evaluator = evaluatorRepository.findById(id);
            evaluators.add(evaluator.get());

        }
        Set<Long> studentGroupIdListLong = studentGroupIdList.stream().map(element->Long.valueOf(element)).collect(Collectors.toSet());
        for (Long id : studentGroupIdListLong){
            Optional<Student> student =studentRepository.findById(id);
            studentGroups.add(student.get());

        }
        group.setJury(evaluators);
        group.setStudents(studentGroups);
        group=groupRepository.save(group);
        groupRepository.save(group);
//
//        return group;
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

