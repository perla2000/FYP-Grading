//package com.example.demo.competences;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping(path="api/v1/competences")
//public class CompetenceController {
//    private final CompetenceService competenceService;
//    @Autowired //this student service should be autowired for us and then injected
//    public  CompetenceController(CompetenceService competenceService){
//        this.competenceService=competenceService;
//                //new StudentService(); we shouldn't use this so we use annotations for injection
//    }
//    @GetMapping
//    public List<Competences> getCompetences(){
//        return competenceService.getCompetences();
//    }
//    @GetMapping(path="{competenceId}")
//    public Optional<Competences> getCompetence(@PathVariable("competenceId") Long competenceId){
//        return competenceService.getCompetence(competenceId);
//    }
//    @PostMapping
//    public void registerNewStudent(@RequestBody Student student){  //we take the request body and map it into the student
//        competenceService.addNewStudent(student);
//    }
//    @DeleteMapping(path="{studentId}")
//    public void deleteStudent(@PathVariable("studentId") Long studentId){
//        competenceService.deleteStudent(studentId);
//    }
//    @PutMapping(path = "{studentId}")
//    public void updateStudent(
//            @PathVariable("studentId") Long studentId,
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String LastName,
//            @RequestParam(required = false) String email) {
//        competenceService.updateStudent(studentId, firstName,LastName,email);
//    }
//
//    }
