package com.UniEnroll.UniEnroll.repository;

import com.UniEnroll.UniEnroll.entity.Student;
import com.UniEnroll.UniEnroll.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
