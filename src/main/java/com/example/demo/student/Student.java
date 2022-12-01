package com.example.demo.student;

//import com.example.demo.group.Group;

import com.example.demo.group.Group;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id

//    @SequenceGenerator(
//            name = "student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize=1
//    )
//    @GeneratedValue(
//            strategy= GenerationType.SEQUENCE,
//            generator="student_sequence"
//    )
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_group_id")
    private Group group;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String email;
    private LocalDate dob;
    @Transient   //it doesn't need to be a column in our database so age will be calculated for us
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



//    public Group getGroup() {
//        return group;
//    }
//
//    public void setGroup(Group group) {
//        this.group = group;
//    }
//
//    public Group getGroupId() {
//        return group;
//    }
//
//    public void setGroupId(Group group) {
//        this.group = group;
//    }

    public Student(){

    }

    public Student(Long id, Group group, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.group = group;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //    public Group getStudentGroup() {
//        return group;
//    }
//    public void setStudentGroup(Group studentGroup) {
//        this.group = studentGroup;
//    }

    @Override
    public String toString(){
        return "Student{"+"id="+id+
                ", firstname='"+firstName+'\''+
                ", firstname='"+lastName+'\''+
                ", email='"+email+'\''+
                ", dob="+dob+
                ", age=" +age+
                '}';
    }

}
