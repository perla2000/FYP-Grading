package com.example.demo.assessment;

import com.example.demo.competence.Competence;

import javax.persistence.*;

import java.util.List;


@Entity
@Table
public class CompetenceValue {
    @Id
    @SequenceGenerator(
            name = "competenceValue_sequence",
            sequenceName = "competenceValue_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator="competenceValue_sequence"
    )
    @Column(name = "id", nullable = false)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "competence_id")
    Competence competence;
    Integer value=0;

    public CompetenceValue() {
    }

    public CompetenceValue(Competence competence, Integer value) {

        this.competence = competence;
        this.value = value;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
