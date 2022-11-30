package com.example.demo.evaluator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/evaluator")
public class EvaluatorController {
    private final EvaluatorService evaluatorService;
    @Autowired
    public  EvaluatorController(EvaluatorService evaluatorService){
        this.evaluatorService=evaluatorService;

    }
    @GetMapping
    public List<Evaluator> getEvaluators(){
        return evaluatorService.getEvaluators();
    }
    @GetMapping(path="{evaluatorId}")
    public Optional<Evaluator> getEvaluator(@PathVariable("evaluatorId") Long studentId){
        return evaluatorService.getEvaluator(studentId);
    }
    @PostMapping
    public void registerNewEvaluator(@RequestBody Evaluator evaluator){
            evaluatorService.addNewEvaluator(evaluator);
    }
    @DeleteMapping(path="{evaluatorId}")
    public void deleteEvaluator(@PathVariable("evaluatorId") Long evaluatorId){
        evaluatorService.deleteEvaluator(evaluatorId);
    }
    @PutMapping(path = "{evaluatorId}")
    public void updateEvaluator(
            @PathVariable("evaluatorId") Long evaluatorId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String LastName,
            @RequestParam(required = false) String email) {
        evaluatorService.updateEvaluator(evaluatorId, firstName,LastName,email);
    }

}
