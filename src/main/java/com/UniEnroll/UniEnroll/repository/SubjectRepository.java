package com.UniEnroll.UniEnroll.repository;

import com.UniEnroll.UniEnroll.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    //List<Subject> findByStudentId(Long studentId);
}
