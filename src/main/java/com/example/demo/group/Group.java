package com.example.demo.group;

import javax.persistence.*;


@Entity
@Table
public class Group {
    @Id
    @SequenceGenerator(
            name = "group_sequence",
            sequenceName = "group_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator="group_sequence"
    )
    private Long id;


    public Group(){

    }
    public Group(Long id){
        this.id=id;



    }

    @Override
    public String toString(){
        return "Group{"+"id="+id+
                '}';
    }

}
