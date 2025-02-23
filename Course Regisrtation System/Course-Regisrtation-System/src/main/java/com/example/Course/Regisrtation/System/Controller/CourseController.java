package com.example.Course.Regisrtation.System.Controller;

import com.example.Course.Regisrtation.System.Model.Course;
import com.example.Course.Regisrtation.System.Model.CourseRegistry;
import com.example.Course.Regisrtation.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congragulations "+name+" Successfully Registed for "+courseName;
    }

    @GetMapping("/test")
    @ResponseBody
    public String test()
    {
        return "Hello Everyone";
    }

}
