package com.example.demo.group;


import com.example.demo.student.Student;
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

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> getGroups(){
            return groupRepository.findAll(); // implemented in the JPARepository
    }
    public Optional<Group> getGroup(Long groupId){
        Optional<Group> group = groupRepository.findById(groupId);
        if (!group.isPresent()) {
            throw new IllegalStateException("Student with the Id \""+groupId+"\" was not found");

        }
        return group;
    }


    public void addNewGroup(Group group) {
//        Optional<Group> studentByEmail = groupRepository.findStudentByEmail (student. getEmail());
//        if (studentByEmail.isPresent()) {
//            throw new IllegalStateException("student belong ");
//
//        }
        groupRepository.save(group) ;


    }

    public void deleteGroup(Long groupId) {
        boolean exists=groupRepository.existsById(groupId);
        if(!exists) {
            throw new IllegalStateException(
                    "student with id " + groupId + " does not exists");
        }
        groupRepository.deleteById(groupId) ;

    }}



//    @Transactional
//    public void updateGroup(Long groupId,
//) {
//        Group student = groupRepository.findById(groupId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "student with id " + groupId + " does not exist"));
//
//        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
//
//            student.setName(name);
//
//            if (email != null &&
//                    email.length() > 0 &&
//                    !Objects.equals(student.getEmail(), email)) {
//                Optional<Group> studentOptional = groupRepository
//                        .findStudentByEmail(email);
//                if (studentOptional.isPresent()) {
//                    throw new IllegalStateException("email taken");
//                }
//                student.setEmail(email);
//
//            }
//        }
//    }
//}
