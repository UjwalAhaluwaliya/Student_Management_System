package com.example.StudentMangementSystemInSpring.StudentController;

import com.example.StudentMangementSystemInSpring.Entity.Student;
import com.example.StudentMangementSystemInSpring.Services.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class studentController {
    @Autowired
    private studentService Service;
    @GetMapping({"/"})
    public String home(){
        return "student";
    }
    @GetMapping("/student")
    public String getAllStudent(Model model){

        model.addAttribute("student",Service.getAllStudent());

    return "student";

    }
    @GetMapping("/student/add")
    public String addStudent(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "addStudent";
    }
    @PostMapping("/student")
    public String save(@ModelAttribute("student") Student student){
        Service.save(student);
        return "redirect:/student";
    }
@GetMapping("/student/edit/{sid}")
    public String editstudent(@PathVariable("sid") Long sid, Model model){
model.addAttribute("student",Service.getById(sid));
return "editStudent";
    }
    @PostMapping("/student/edit/{sid}")
    public String update(@PathVariable("sid") Long sid, @ModelAttribute("student") Student student){
        Student existingStudent=Service.getById(sid);
        existingStudent.setName(student.getName());
        existingStudent.setCollegename(student.getCollegename());
        Service.save(existingStudent);
        return "redirect:/student";
    }
@GetMapping("/student/delete/{sid}")
public String delete(@PathVariable Long sid) {
    Service.delete(sid);
    return "redirect:/student";
}
}