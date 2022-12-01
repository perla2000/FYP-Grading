package com.example.demo.competences;



import com.example.demo.SheetCompetences.SheetCompetences;
import com.example.demo.group.Group;

import javax.persistence.*;


@Entity
@Table
public class Competences {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer value=0;
    private Integer poids;
    @ManyToOne
    @JoinColumn(name = "sheet_competences_id")
    private SheetCompetences sheetCompetences;

    public Competences(){

    }

    public Competences(Long id, String description, Integer value, Integer poids) {
        this.id = id;
        this.description = description;
        this.value = value;
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

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
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
}
