//package com.example.demo.Evaluator;
//
//
//import com.example.demo.group.Group;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table
//
//public class Evaluator {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//
//    @Column(nullable = false)
//    private String Email;
//
//    @Column(nullable = false)
//    private String firstName;
//
//    @Column(nullable = false)
//    private String lastName;
//
//
//    @Column(nullable = false)
//    private Boolean advisor;
//    @OneToMany  //hon mich lezim many to many ?
//    private List<Group> studentGroup = new ArrayList<>();
//
//    public Evaluator() {
//    }
//
//    public Evaluator(long id, String email, String firstName, String lastName, List<Group> group) {
//        this.id = id;
//        Email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.studentGroup = group;
//    }
//
//}
