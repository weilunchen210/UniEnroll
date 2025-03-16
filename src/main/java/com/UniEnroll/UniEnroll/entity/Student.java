package com.UniEnroll.UniEnroll.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @Column
    private String studentName;

    @Column
    private String studentEmail;

    @Column
    private String studentPassword;

    @Column
    private String studentAddress;

    @Column(unique = true)
    private String studentPhone;

    @ManyToOne
    private Course course;

    @Column
    private Date enrollmentDate;
}
