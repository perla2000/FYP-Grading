package com.example.demo.grading;


import com.example.demo.assessment.Assessment;
import com.example.demo.assessment.AssessmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class GradingService {  //(GradingRepository gradingRepository)
    //    public void registerGroupes(GradingCheckResponse request) {
//        Grading grading = Grading.builder().studentId(request.studentId()).build();
//        gradingRepository.save(grading);
//
//
    private final GradingRepository gradingRepository;
    private final AssessmentRepository assessmentRepository;

    public GradingService(GradingRepository gradingRepository, AssessmentRepository assessmentRepository) {
        this.gradingRepository = gradingRepository;

        this.assessmentRepository = assessmentRepository;
    }


    public Double NoteFinale(Long studentId) {
        Optional<Grading> grading = gradingRepository.findGradingByStudentId(studentId);
        Double FinalGrade=0.0;
        if (!grading.isPresent()) {
            List<Assessment> assessments = assessmentRepository.findByStudentId(studentId);
            Grading grade =new Grading();
            grade.setAssessments(assessments);
            grade.setStudentId(studentId);
            grade.setFinaleNote();
            FinalGrade= grade.getFinaleNote();


            gradingRepository.save(grade
                    //Grading.builder().studentId(studentId).FinaleNote(0).build()
            );
        } else {

            List<Assessment> assessments = assessmentRepository.findByStudentId(studentId);
            grading.get().setAssessments(assessments);
            grading.get().setFinaleNote();
            FinalGrade= grading.get().getFinaleNote();

        }

        return FinalGrade;
    }
}