package com.example.demo.Grades;



import com.example.demo.Levels.Levels;
import com.example.demo.SheetCompetences.SheetCompetences;
import com.example.demo.evaluator.Evaluator;
import org.apache.catalina.Group;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    private Integer value=0;
    private Integer poids;
    @OneToMany
    private List<Levels> levels=List.of();
    @ManyToOne
    @JoinColumn(name = "student_group_id")
    private Group group;
    public Grades() {
    }

    public Grades(Long id, String description, Integer value, Integer poids, List<Levels> levels, Group group) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.poids = poids;
        this.levels = levels;
        this.group = group;
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

    public List<Levels> getLevels() {
        return levels;
    }

    public void setLevels(List<Levels> levels) {
        this.levels = levels;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
