package com.example.GetPostApplication.Service;

import com.example.GetPostApplication.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students=new ArrayList<>(
            Arrays.asList(new Student(1,"Mani","SpringBoot"),
                    new Student(2,"Prakash","WebDev"),
                    new Student(3,"Bibin","UI/UX"))
    );

    public List<Student> getAllStudents() {
        return  students;
    }

    public void addStudents(int rno, String name, String tech) {
        Student student=new Student(rno,name,tech);
        students.add(student);
    }
}
