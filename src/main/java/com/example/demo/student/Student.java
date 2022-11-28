package com.example.demo.student;

//import com.example.demo.group.Group;

import com.example.demo.group.Group;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
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

    private String name;
    private String email;
    private LocalDate dob;
    @Transient   //it doesn't need to be a column in our database so age will be calculated for us
    private Integer age;

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
    public Student(Long id,String name,String email,LocalDate dob){
        this.id=id;
        this.name=name;
        this.email=email;
        this.dob=dob;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob=dob;
    }
    public Integer getAge(){
        return Period.between(this.dob,LocalDate.now()).getYears();
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public Group getStudentGroup() {
        return group;
    }
    public void setStudentGroup(Group studentGroup) {
        this.group = studentGroup;
    }
    @Override
    public String toString(){
        return "Student{"+"id="+id+
                ", name='"+name+'\''+
                ", email='"+email+'\''+
                ", dob="+dob+
                ", age=" +age+
                '}';
    }

}
