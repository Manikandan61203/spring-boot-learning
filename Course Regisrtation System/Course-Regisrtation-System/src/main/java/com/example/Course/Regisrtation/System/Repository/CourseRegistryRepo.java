package com.example.Course.Regisrtation.System.Repository;

import com.example.Course.Regisrtation.System.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
