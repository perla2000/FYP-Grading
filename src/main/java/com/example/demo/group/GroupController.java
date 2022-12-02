package com.example.demo.group;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/group")
public class GroupController {
    private final GroupService groupService;
    @Autowired //this group service should be autowired for us and then injected
    public  GroupController(GroupService groupService){
        this.groupService=groupService;
        //new GroupService(); we shouldn't use this so we use annotations for injection
    }
    @GetMapping
    public List<Group> getGroups(){
        return groupService.getGroups();
    }
    @GetMapping(path="{groupId}")
    public Optional<Group> getGroup(@PathVariable("groupId") Long groupId){
        return groupService.getGroup(groupId);
    }
    @PostMapping
    public void createGroup(@RequestParam(value = "evaluatorIdList") List<String> evaluatorIdList, @RequestParam(value = "studentGroupIdList") List<String> studentGroupIdList) {
        if (evaluatorIdList.size() > 0) {

            //   if (studentGroupIdList.size()>0) {

            groupService.createGroup(evaluatorIdList, studentGroupIdList);
//
//
//                return new ResponseEntity<>(group, HttpStatus.OK);
            //}
            //throw new IllegalStateException("student Group List Not Found");
        }
        //  throw new IllegalStateException("Evaluator List Not Found");
    }
    @DeleteMapping(path="{groupId}")
    public void deleteGroup(@PathVariable("groupId") Long groupId){
        groupService.deleteGroup(groupId);
    }


//    @PutMapping(path="{groupId}")
//    public void deleteStudent(@PathVariable("groupId") Long groupId,
//                              @RequestParam(required = true) Long studentId){groupService.deleteStudentInGroup(groupId,studentId);
//    }

//    @PutMapping(path = "{groupId}")
//    public void updateGroup(
//            @PathVariable("groupId") Long groupId,
//            @RequestParam(required = false) String description,
//            @RequestParam(required = false) Long studentId) {
//        groupService.updateGroup(groupId, description, studentId);
//    }

}
