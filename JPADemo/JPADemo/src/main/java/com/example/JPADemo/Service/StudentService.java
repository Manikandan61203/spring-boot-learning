package com.example.JPADemo.Service;

import com.example.JPADemo.Model.Student;
import com.example.JPADemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStdByRno(int rno) {
        return studentRepo.findById(rno).orElse(null);
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public String updateStudent(Student student) {
        studentRepo.save(student);
        return "Student Updated Successfully";
    }

    public String deleteStudent(int rno) {
        studentRepo.deleteById(rno);
        return "Student Deleted Successfully";
    }

    public void clearStudents() {
        studentRepo.deleteAll();
    }

    public List<Student> getStdByTech(String technology) {
        return studentRepo.findByTechnology(technology);
    }

    public List<Student> getStdByGen(String gender) {
        return studentRepo.findByGender(gender);
    }

//    public List<Student> getStdByGenAndTech(String gender, String technology) {
//        return studentRepo.findByGenderAndTechnology(gender,technology);
//    }

    public List<Student> getStdByTechAndStateAndGender(String technology, String state,String gender) {
        return studentRepo.findByTechnologyAndStateAndGender(technology,state,gender);
    }
}
