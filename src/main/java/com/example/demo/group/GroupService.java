package com.example.demo.group;



import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service //@Component   //to use Autowired @Service or @Component are the same thing
public class GroupService {
    @Autowired
    private final GroupRepository groupRepository;
    @Autowired
    private final StudentRepository studentRepository;
//    @Autowired
//    private final StudentRepository studentRepository;
//    @Autowired
//    private final StudentService studentService;


    public GroupService(GroupRepository groupRepository, StudentRepository studentRepository){//, StudentRepository studentRepository, StudentService studentService) {
        this.groupRepository = groupRepository;
//        this.studentRepository = studentRepository;
//        this.studentService = studentService;
        this.studentRepository = studentRepository;
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
    public Group addNewGroup(Group newgroup)
    {
        if (Objects.nonNull(newgroup))
        {
            Group Group = groupRepository.save(newgroup);

            return Group;
        }
        throw new IllegalStateException("StudentGroupNotFound");
    }
//    @Transactional
//    public void deleteStudentInGroup(Long groupId,Long studentId) {
//
//        Group group = groupRepository.findById(groupId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "group with id " + groupId + " does not exist"));
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "student with id " + studentId + " does not exist"));
//        List<Student> students=group.getStudents();
//
//        for (int i=0;i<students.size();++i){
//            if (Objects.equals(students.get(i).getId(),studentId)){
//                        students.remove(i);
//                        group.setStudents(students);
//                    }
//                    else{
//                         throw new IllegalStateException("student");
//                    }
//                }
//
//
//    }


//
//    @Transactional
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
////                        students.add(i,studentToUpdate);
//
//                    }
//                    else{
////                        group.setStudents(students.add(students.add(studentService.getStudent(studentId))));
//                    }
//                }
////                Optional<Group> group = groupRepository
////                        .findGroupByEmail(email);
////                if (GroupOptional.isPresent()) {
////                    throw new IllegalStateException("email taken");
////                }
////                group.setEmail(email);
////
////            }

    //}
//}
   // }
}
