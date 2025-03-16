package com.UniEnroll.UniEnroll.service;

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

}
