package com.example.demo.group;
//
//
//
//import com.example.demo.student.Student;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table
//public class Group {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//    @OneToMany
//    private List<Student> students = new ArrayList<>();
//    private String description;
////    @OneToOne
////    private Jury jury;
//
//
//    public Group() {
//    }
//
//    public Group(String description) {
//        this.description=description;
//    }
//
//    public Group(long id,String description, List<Student> students) {
//        this.id = id;
//        this.students = students;
//        this.description=description;
//    }
//
//    public Group(List<Student> students) {
//        this.students = students;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//    public String getDesc(){
//        return description;
//    }
//    public void setDesc(String description){
//        this.description=description;
//    }
//
////    public Jury getJury() {
////        return jury;
////    }
////
////    public void setJury(Jury jury) {
////        this.jury = jury;
////    }
//
//}


import com.example.demo.student.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String description;
    @OneToMany
    private List<Student> students = new ArrayList<>();
//
//    @OneToOne
//    private Jury jury;


    public Group() {
    }

    public Group(long id, List<Student> students,String description) {
        this.id = id;
        this.students = students;
        this.description=description;
    }

    public Group(List<Student> students,String description) {

        this.students = students;
        this.description=description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

//    public Jury getJury() {
//        return jury;
//    }
//
//    public void setJury(Jury jury) {
//        this.jury = jury;
//    }

}
