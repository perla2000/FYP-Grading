package com.example.demo.group;

//import com.example.demo.Assessment.Assessment;
import com.example.demo.evaluator.Evaluator;
import com.example.demo.student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Groupes")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String description;
    @OneToMany
    private List<Student> students=List.of() ;
    @OneToMany
    private List<Evaluator> jury=List.of();


    public List<Evaluator> getJury() {
        return jury;
    }

    public void setJury(List<Evaluator> jury) {
        this.jury = jury;
    }



    public Group() {

    }

    public Group(long id, String description, List<Student> students) {
        this.id = id;
        this.description = description;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



}
