package com.example.demo.assessment;


import com.example.demo.evaluator.Evaluator;
import com.example.demo.student.Student;

import javax.persistence.*;

import java.util.List;


@Entity
@Table
public class Assessment {
    @Id
    @SequenceGenerator(
            name = "assessment_sequence",
            sequenceName = "assessment_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator="assessment_sequence"
    )
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Double poids;


    @OneToMany
    private List<CompetenceValue> competences=List.of();
    @ManyToOne
    @JoinColumn(name = "evaluator_id")
    private Evaluator evaluator;
//    @ManyToOne
//    @JoinColumn(name = "student_id")
    private Long studentId;

    private Double totalGrade=0.0;



    public Assessment(){

    }

    public Assessment(Long id, String description, Double poids, List<CompetenceValue> competences, Evaluator evaluator, Double totalGrade) {
        this.id = id;
        this.description = description;
        this.poids = poids;
        this.competences = competences;
        this.evaluator = evaluator;
        this.totalGrade = totalGrade;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
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

    public List<CompetenceValue> getCompetences() {
        return competences;
    }

    public void setCompetences(List<CompetenceValue> competences) {
        this.competences = competences;
    }

    public Double getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(Double totalGrade) {
        this.totalGrade = totalGrade;
    }
    public Evaluator getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    public Long getStudent() {
        return studentId;
    }

    public void setStudent(Long studentId) {
        this.studentId = studentId;
    }
}
