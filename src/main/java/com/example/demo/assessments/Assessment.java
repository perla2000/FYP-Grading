package com.example.demo.assessments;
import com.example.demo.grading.Grading;
import com.example.demo.sheetCompetence.SheetCompetence;

import javax.persistence.*;

@Entity
@Table
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer pourcentage;
    @ManyToOne
    @JoinColumn(name = "sheet_competences_id")
    private SheetCompetence sheetCompetences;
    @OneToMany
    private Grading grading;

    public Assessment(){

    }

    public Assessment(Long id, String description, Integer pourcentage) {
        this.id = id;
        this.description = description;
        this.pourcentage = pourcentage;
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

    public Integer getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Integer pourcentage) {
        this.pourcentage = pourcentage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
