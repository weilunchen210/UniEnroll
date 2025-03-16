package com.UniEnroll.UniEnroll.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;

    @Column
    private String courseName;

    @Column
    private String courseDescription;

}
