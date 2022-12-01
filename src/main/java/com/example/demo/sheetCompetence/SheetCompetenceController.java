package com.example.demo.sheetCompetence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/group")
public class SheetCompetenceController {
    private final SheetCompetenceService sheetCompetenceService;
    @Autowired
    public SheetCompetenceController(SheetCompetenceService sheetCompetenceService){
        this.sheetCompetenceService=sheetCompetenceService;

    }
    @GetMapping
    public List<SheetCompetence> getSheets(){
        return sheetCompetenceService.getSheets();
    }
    @GetMapping(path="{sheetId}")
    public Optional<SheetCompetence> getSheet(@PathVariable("sheetId") Long sheetId){
        return sheetCompetenceService.getSheet(sheetId);
    }
    @PostMapping
    public void createSheet(@RequestParam(value = "competenceIdList") List<String> competenceIdList, @RequestParam(value = "assessmentIdList") List<String> assessmentIdList) {
        if (competenceIdList.size() > 0) {
            if (assessmentIdList.size()>0) {

            sheetCompetenceService.createSheet(competenceIdList, assessmentIdList);

           }
            throw new IllegalStateException("competenceIdList Not Found");
        }
         throw new IllegalStateException("assessmentIdList Not Found");
    }
    @DeleteMapping(path="{sheetId}")
    public void deleteSheet(@PathVariable("sheetId") Long sheetId){
        sheetCompetenceService.deleteSheet(sheetId);
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
