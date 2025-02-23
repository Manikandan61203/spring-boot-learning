package com.example.GetPostApplication.Controller;

import com.example.GetPostApplication.Model.Student;
import com.example.GetPostApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("students/add")
    public void addStudents(@RequestParam("rno") int rno,
                            @RequestParam("name") String name,
                            @RequestParam("tech") String tech){
        studentService.addStudents(rno,name,tech);
    }
}
