package com.example.demo.grading;


import com.example.demo.assessment.Assessment;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Grading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer FinalGrade;
    @OneToMany
    private List<Assessment> assessments=new ArrayList<>();

    public Grading() {
    }

    public Grading(Long id, List<Assessment> assessments) {
        this.id = id;
        this.assessments = assessments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFinalGrade() {
        return FinalGrade;
    }

    public void setFinalGrade() {
        Integer finalGrade=0;
        for(int i=0;i<assessments.size();i++){
            finalGrade+=(assessments.get(i)).getTotalGrade()*(assessments.get(i)).getPoids();
        }
        this.FinalGrade=finalGrade;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
