//package com.example.demo.jury;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping(path="api/v1/jury")
//public class JuryController {
//    private final JuryService juryService;
//    @Autowired //this group service should be autowired for us and then injected
//    public  JuryController(JuryService juryService){
//        this.juryService=juryService;
//        //new GroupService(); we shouldn't use this so we use annotations for injection
//    }
//    @GetMapping
//    public List<Jury> getJuries(){
//        return juryService.getJuries();
//    }
//    @GetMapping(path="{juryId}")
//    public Optional<Jury> getJury(@PathVariable("juryId") Long juryId){
//        return juryService.getJury(juryId);
//    }
//    @PostMapping
//    public ResponseEntity<Jury> createJury(@RequestParam(value = "evaluatorIdList") List<String> evaluatorIdList, @RequestParam(value = "studentGroupIdList") List<String> studentGroupIdList) {
//        if (evaluatorIdList.size()>0) {
//
//            if (studentGroupIdList.size()>0) {
//
//                Jury jury = juryService.createJury(evaluatorIdList);
//
//
//                return new ResponseEntity<>(jury, HttpStatus.OK);
//            }
//            throw new IllegalStateException("student Group List Not Found");
//        }
//        throw new IllegalStateException("Evaluator List Not Found");
//    }
//
//
//
//}
