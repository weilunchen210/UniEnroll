package com.UniEnroll.UniEnroll.service;

import com.UniEnroll.UniEnroll.entity.Course;
import com.UniEnroll.UniEnroll.entity.Subject;
import com.UniEnroll.UniEnroll.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository SubjectRepository;

    public SubjectService(SubjectRepository SubjectRepository) {
        this.SubjectRepository = SubjectRepository;
    }

    public List<Subject> getAllSubjects(){
        return SubjectRepository.findAll();
    }

    public Subject getSubjectById(Long id){
        return SubjectRepository.findBySubjectID(id);
    };




}
