package com.example.demo.grading;


import com.example.demo.assessments.Assessment;
import org.apache.catalina.Group;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Grading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer value=0;
    private Integer poids;
    @OneToMany
    private List<Assessment> assessments=new ArrayList<>();;

    public Grading() {
    }

    public Grading(Long id, String description, Integer value, Integer poids, List<Assessment> assessments) {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

}
