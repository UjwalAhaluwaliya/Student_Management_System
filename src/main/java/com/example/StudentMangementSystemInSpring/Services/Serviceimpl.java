package com.example.StudentMangementSystemInSpring.Services;

import com.example.StudentMangementSystemInSpring.Entity.Student;
import com.example.StudentMangementSystemInSpring.studentRepo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Serviceimpl implements studentService {
    @Autowired
    studentRepo studentRepo;

    public List<Student> getAllStudent() {
        List<Student> list = studentRepo.findAll();
        return list;
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public Student getById(Long sid) {
        return studentRepo.findById(sid).get();
    }

    public void delete(Long sid) {
        studentRepo.deleteById(sid);
    }
}
//    }
//    public Student update(Student student){
//        return studentRepo.save(student);
//    }

