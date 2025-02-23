package com.example.Course.Regisrtation.System.Repository;

import com.example.Course.Regisrtation.System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {
}
