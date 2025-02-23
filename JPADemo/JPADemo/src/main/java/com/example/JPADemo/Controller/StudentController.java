package com.example.JPADemo.Controller;

import com.example.JPADemo.Model.Student;
import com.example.JPADemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("students/{rno}")
    public ResponseEntity<Student> getStdByRno(@PathVariable int rno){
        Student student=studentService.getStdByRno(rno);
        if(student==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PostMapping("students")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Added",HttpStatus.CREATED);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return studentService.deleteStudent(rno);
    }

    @DeleteMapping("students/clear")
    public String clearStudents(){
        studentService.clearStudents();
        return "All Students Deleted Successfully";
    }

    @GetMapping("students/technology/{tech}")
    public List<Student> getStdByTech(@PathVariable("tech") String technology){
        return studentService.getStdByTech(technology);
    }

    @GetMapping("students/gender/{gen}")
    public List<Student> getStdByGen(@PathVariable("gen") String gender){
        return studentService.getStdByGen(gender);
    }
//
//    @PostMapping("students/filter")
//    public List<Student> getStdByGenAndTech(@Param("gender") String gender, @Param("technology") String technology){
//        return studentService.getStdByGenAndTech(gender,technology);
//    }

    @GetMapping("students/filter")
    public List<Student> getStdByTechAndStateAndGender(@Param("technology") String technology,@Param("state") String state,@Param("gender") String gender){
        return studentService.getStdByTechAndStateAndGender(technology,state,gender);
    }
}
