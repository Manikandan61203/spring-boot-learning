package com.example.StudentCRUD.Controller;

import com.example.StudentCRUD.Model.Student;
import com.example.StudentCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentContoller {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("students/{rno}")
    public Student getStdById(@PathVariable("rno") int rollno){
        return studentService.getStdById(rollno);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Success";
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return studentService.deleteStudent(rno);
    }
}
