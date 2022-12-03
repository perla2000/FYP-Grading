package com.example.demo.grading;

import com.example.demo.assessment.Assessment;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Grading {
    @Id
    @SequenceGenerator(name="grading_id_generator",sequenceName="grading_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "grading_id_sequence")
    @Column(name = "id", nullable = false)
    private Integer id;
    private Long studentId;
    private Double FinaleNote;
    private String pourcentage;
    @OneToMany
    private List<Assessment> assessments=new ArrayList<>();

    public Double getFinaleNote() {
        return FinaleNote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List<Assessment> getAssessments() {
        return assessments;
    }



    public Long getStudentId() {
        return studentId;
    }

        public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setFinaleNote(Double finaleNote) {
        FinaleNote = finaleNote;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }

    public String getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(String pourcentage) {
        this.pourcentage = pourcentage;
    }
}