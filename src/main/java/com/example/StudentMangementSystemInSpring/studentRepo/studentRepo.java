package com.example.StudentMangementSystemInSpring.studentRepo;

import com.example.StudentMangementSystemInSpring.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<Student,Long> {

}
