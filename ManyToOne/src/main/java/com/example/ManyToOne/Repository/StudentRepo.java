package com.example.ManyToOne.Repository;

import com.example.ManyToOne.Model.Library;
import com.example.ManyToOne.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findByBook(Library book);
//    List<Student> findByBook(int bookId);
}
