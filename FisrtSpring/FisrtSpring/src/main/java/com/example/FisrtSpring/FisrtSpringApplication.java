package com.example.FisrtSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FisrtSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FisrtSpringApplication.class, args);
		Student student=context.getBean(Student.class);
		//student.show();

		student.writeExam();
		//for Scope example
//		Student student1=context.getBean(Student.class);
//		student.setAge(22);
//		System.out.println(student.getAge()+" : "+student1.getAge());
	}

}
