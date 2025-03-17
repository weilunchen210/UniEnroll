package com.UniEnroll.UniEnroll.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @Column
    private String studentName;

//    @Column
//    private String currentCGPA;

    @Column
    private String studentAddress;

    @Column(unique = true)
    private String studentPhone;

    @ManyToOne
    private Course course;

    @Column
    private Date enrollmentDate;
}
