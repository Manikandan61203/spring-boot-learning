package com.example.FisrtSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {
    //field injection
//    @Autowired
//    private Pen pen;

    // Loose Coupling
    @Autowired
    @Qualifier("pencil")
    private Writer writer;



    //constructor injection
//    @Autowired
//    public Student(Pen pen) {
//        this.pen = pen;
//    }


    //setter injection
//    @Autowired
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }

    //for Scope
//    int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void show(){
        System.out.println("Hello World!");
    }

    public void writeExam(){
//        pen.write();
        writer.write();
    }
}
