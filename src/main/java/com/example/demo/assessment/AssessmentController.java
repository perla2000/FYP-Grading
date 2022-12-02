package com.example.demo.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/assessment")
public class AssessmentController {
    private final AssessmentService assessmentService;
    @Autowired
    public AssessmentController(AssessmentService assessmentService){
        this.assessmentService=assessmentService;

    }
    @GetMapping
    public List<Assessment> getSheets(){
        return assessmentService.getSheets();
    }
    @GetMapping(path="{sheetId}")
    public Optional<Assessment> getSheet(@PathVariable("sheetId") Long sheetId){
        return assessmentService.getSheet(sheetId);
    }
    @PostMapping
    public void createSheet(@RequestParam(value = "competenceIdList") List<String> competenceIdList, @RequestParam(value = "valuesList") List<String> valuesList) {
        if (competenceIdList.size() > 0) {
            if (valuesList.size() > 0) {
                assessmentService.createSheet(competenceIdList, valuesList);

            }
            throw new IllegalStateException("valuesList Not Found");
        }
        throw new IllegalStateException("competenceIdList Not Found");
    }
    @DeleteMapping(path="{sheetId}")
    public void deleteSheet(@PathVariable("sheetId") Long sheetId){
        assessmentService.deleteSheet(sheetId);
    }




//    @PutMapping(path = "{assessmentId}")
//    public void updateGroup(
//            @PathVariable("groupId") Long groupId,
//            @RequestParam(required = false) String description,
//            @RequestParam(required = false) Long studentId) {
//        assessmentService.updateGroup(groupId, description, studentId);
//    }

}
