//package com.example.demo.jury;
//
//
//
//import com.example.demo.evaluator.Evaluator;
//import com.example.demo.group.Group;
//
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table
//
//public class Jury {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//
//    @OneToMany
//    private List<Evaluator> evaluatorList = new ArrayList<>();
//
//    @OneToMany
//    private List<Group> studentGroupList = new ArrayList<>();
//
//    public Jury() {
//    }
//
//    public Jury(long id, List<Evaluator> evaluatorList, List<Group> studentGroupList) {
//        this.id = id;
//        this.evaluatorList = evaluatorList;
//        this.studentGroupList = studentGroupList;
//    }
//
//    public Jury(List<Evaluator> evaluatorList, List<Group> studentGroupList) {
//        this.evaluatorList = evaluatorList;
//        this.studentGroupList = studentGroupList;
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
//    public List<Evaluator> getEvaluatorList() {
//        return evaluatorList;
//    }
//
//    public void setEvaluatorList(List<Evaluator> evaluatorList) {
//        this.evaluatorList = evaluatorList;
//    }
//
//    public List<Group> getStudentGroupList() {
//        return studentGroupList;
//    }
//
//    public void setStudentGroupList(List<Group> studentGroupList) {
//        this.studentGroupList = studentGroupList;
//    }
//}
