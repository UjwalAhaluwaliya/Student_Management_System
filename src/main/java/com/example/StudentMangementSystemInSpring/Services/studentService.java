package com.example.StudentMangementSystemInSpring.Services;

import com.example.StudentMangementSystemInSpring.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface studentService {
    public List<Student> getAllStudent();


    public Student save(Student student);

    public Student getById(Long sid);

    public void delete(Long sid);
}
