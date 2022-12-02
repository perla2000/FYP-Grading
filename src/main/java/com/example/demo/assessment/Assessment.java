package com.example.demo.assessment;


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

    @OneToMany
    List<CompetenceValue> competences=List.of();



    private Integer totalGrade=0;

    public Assessment(){

    }

    public Assessment(Long id, String description, List<CompetenceValue> competences, Integer totalGrade) {
        this.id = id;
        this.description = description;
        this.competences = competences;
        this.totalGrade = totalGrade;
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

    public Integer getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(Integer totalGrade) {
        this.totalGrade = totalGrade;
    }


}
