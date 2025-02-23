package com.example.Course.Regisrtation.System.Service;

import com.example.Course.Regisrtation.System.Model.Course;
import com.example.Course.Regisrtation.System.Model.CourseRegistry;
import com.example.Course.Regisrtation.System.Repository.CourseRegistryRepo;
import com.example.Course.Regisrtation.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepository.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
