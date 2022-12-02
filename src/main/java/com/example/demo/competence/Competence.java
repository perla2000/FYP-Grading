package com.example.demo.competence;


import javax.persistence.*;


@Entity
@Table
public class Competence {
    @Id
    @SequenceGenerator(
            name = "competence_sequence",
            sequenceName = "competence_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator="competence_sequence"
    )
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;



    public Competence() {
    }

    public Competence(Long id, String description) {
        this.id = id;
        this.description = description;
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

}
