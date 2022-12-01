package com.example.demo.SheetCompetences;



import com.example.demo.Levels.Levels;
import com.example.demo.competences.Competences;
import com.example.demo.group.Group;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class SheetCompetences {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer value=0;

    @OneToMany
    private List<Competences> competences;
    @OneToMany
    private List<Levels> levels;

    public SheetCompetences(){

    }

    public SheetCompetences(Long id, String description, Integer value, List<Competences> competences) {
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

    public List<Competences> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competences> competences) {
        this.competences = competences;
    }

    public List<Levels> getLevels() {
        return levels;
    }

    public void setLevels(List<Levels> levels) {
        this.levels = levels;
    }
}
