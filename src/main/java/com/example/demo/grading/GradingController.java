package com.example.demo.grading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/grading")
public class GradingController {
    private final GradingService gradingService;


    public GradingController(GradingService gradingService) {
        this.gradingService = gradingService;
    }
    @GetMapping(path="{studentId}")
    public GradingCheckResponse CalculeNoteFinale(@PathVariable("studentId") Integer studentID){
        Double FinaleNote = gradingService.NoteFinale(Long.valueOf(studentID));
        return new GradingCheckResponse(FinaleNote);
    }






}
