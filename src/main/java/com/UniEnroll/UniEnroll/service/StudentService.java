package com.UniEnroll.UniEnroll.service;

import com.UniEnroll.UniEnroll.dto.CreateStudentDTO;
import com.UniEnroll.UniEnroll.entity.Student;
import com.UniEnroll.UniEnroll.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(CreateStudentDTO createStudentDTO){
        LocalDateTime createdAt = LocalDateTime.now();
        //Student student = Student.builder().
        return studentRepository.save(createStudentDTO);
    }
}
