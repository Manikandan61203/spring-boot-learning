package com.example.ManyToOne.Service;

import com.example.ManyToOne.Model.Library;
import com.example.ManyToOne.Model.Student;
import com.example.ManyToOne.Repository.LibraryRepo;
import com.example.ManyToOne.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    LibraryRepo libraryRepo;

    public String addStudents(Student student) {
        studentRepo.save(student);
        return "Student Added Successfully";
    }

    public List<Student> getStd() {
        return studentRepo.findAll();
    }

    public String addBook(Library book) {
        libraryRepo.save(book);
        return "Book Added Successfully";
    }

    public List<Library> getBooks() {
        return libraryRepo.findAll();
    }
}
