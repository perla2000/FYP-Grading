package com.example.demo.group;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/group")
public class GroupController {
    private final GroupService groupService;
    @Autowired //this student service should be autowired for us and then injected
    public  GroupController(GroupService groupService){
        this.groupService=groupService;
                //new StudentService(); we shouldn't use this so we use annotations for injection
    }
    @GetMapping
    public List<Group> getGroups(){
        return groupService.getGroups();
    }
    @GetMapping(path="groupId}")
    public Optional<Group> getGroup(@PathVariable("studentId") Long studentId){
        return groupService.getGroup(studentId);
    }
    @PostMapping
    public void registerNewSGroup(@RequestBody Group group){  //we take the request body and map it into the student
        groupService.addNewGroup(group);
    }
    @DeleteMapping(path="{groupId}")
    public void deleteGroup(@PathVariable("groupId") Long groupId){
        groupService.deleteGroup(groupId);
    }
//    @PutMapping(path = "{groupId}")
//    public void updateGroup(
//            @PathVariable("groupId") Long groupId,
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String email) {
//        groupService.updateGroup(groupId, name, email);
//    }

    }
