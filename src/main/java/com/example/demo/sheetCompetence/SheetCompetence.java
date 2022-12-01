//package com.example.demo.sheetCompetence;
//
//
//
//import com.example.demo.levels.Levels;
//import com.example.demo.competence.Competences;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table
//public class SheetCompetence {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    private String description;
//    private Integer value=0;
//
//    @OneToMany
//    private List<Competences> competences;
//    @OneToMany
//    private List<Levels> levels;
//
//    public SheetCompetence(){
//
//    }
//
//    public SheetCompetence(Long id, String description, Integer value, List<Competences> competences) {
//        this.id = id;
//        this.description = description;
//        this.value = value;
//        this.competences = competences;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getValue() {
//        return value;
//    }
//
//    public void setValue(Integer value) {
//        this.value = value;
//    }
//
//    public List<Competences> getCompetences() {
//        return competences;
//    }
//
//    public void setCompetences(List<Competences> competences) {
//        this.competences = competences;
//    }
//
//    public List<Levels> getLevels() {
//        return levels;
//    }
//
//    public void setLevels(List<Levels> levels) {
//        this.levels = levels;
//    }
//}
