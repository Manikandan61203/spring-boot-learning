package com.example.StudentCRUD.Service;

import com.example.StudentCRUD.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

     List<Student> students=new ArrayList<>(
         Arrays.asList(
                 new Student(1,"Mani","IT"),
                 new Student(2,"Prakash","CTS"))
     );

    public List<Student> getStudents() {
        return students;
    }

    public Student getStdById(int rollno) {
        int index=0;
        boolean c=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rollno){
                index=i;
                c=true;
                break;
            }
        }
        if(c) return students.get(index);
        else return new Student(rollno,"","");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudent(Student student) {
        int index=0;
        boolean c=false;
        for(int i=0;i< students.size();i++){
            if(students.get(i).getRno()==student.getRno()){
                index=i;
                c=true;
                break;
            }
        }
        if(c) {
            students.set(index,student);
            return "Updated Successfully";
        }else{
            return "No Match Found";
        }
    }

    public String deleteStudent(int rno) {
        int index=0;
        boolean c=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rno){
                index=i;
                c=true;
                break;
            }
        }
        if(c) {
            students.remove(index);
            return "Deleted Successfully";
        }else {
            return "No Such RollNo Found!";
        }
    }
}
