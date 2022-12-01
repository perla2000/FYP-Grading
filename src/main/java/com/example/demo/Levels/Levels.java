package com.example.demo.Levels;



import com.example.demo.Grades.Grades;
import com.example.demo.SheetCompetences.SheetCompetences;

import javax.persistence.*;

@Entity
@Table
public class Levels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer pourcentage;
    @ManyToOne
    @JoinColumn(name = "sheet_competences_id")
    private SheetCompetences sheetCompetences;
    @OneToMany
    private Grades grade;

    public Levels(){

    }

    public Levels(Long id, String description, Integer pourcentage) {
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
