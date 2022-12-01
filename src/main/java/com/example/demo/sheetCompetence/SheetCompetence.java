package com.example.demo.sheetCompetence;
import com.example.demo.assessments.Assessment;
import com.example.demo.competence.Competence;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class SheetCompetence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer value=0;

    @OneToMany
    private List<Competence> competences;
    @OneToMany
    private List<Assessment> assessments;
    private Integer totalGrade;

    public SheetCompetence(){

    }

    public SheetCompetence(Long id, String description, Integer value, List<Competence> competences) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.competences = competences;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }

    public Integer getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(Integer totalGrade) {
        this.totalGrade = totalGrade;
    }
}
