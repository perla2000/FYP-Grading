//package com.example.demo.competence;
//
//
//
////import com.example.demo.sheetCompetence.SheetCompetence;
//
//import javax.persistence.*;
//
//
//@Entity
//@Table
//public class Competence {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    private String description;
//    private Integer value=0;
//    private Integer poids;
//    @ManyToOne
//    @JoinColumn(name = "sheet_competences_id")
//    private SheetCompetence sheetCompetence;
//
//    public Competence() {
//    }
//
//    public Competence(Long id, String description, Integer value, Integer poids, SheetCompetence sheetCompetence) {
//        this.id = id;
//        this.description = description;
//        this.value = value;
//        this.poids = poids;
//        this.sheetCompetence = sheetCompetence;
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
//    public Integer getPoids() {
//        return poids;
//    }
//
//    public void setPoids(Integer poids) {
//        this.poids = poids;
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
//}
