package com.example.ManyToOne.Service;

import com.example.ManyToOne.Model.Library;
import com.example.ManyToOne.Model.Student;
import com.example.ManyToOne.Repository.LibraryRepo;
import com.example.ManyToOne.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    LibraryRepo libraryRepo;

    @Transactional
    public String addStudents(Student student) {
        studentRepo.save(student);
        return "Student Added Successfully";
    }

    public List<Student> getStd() {
        return studentRepo.findAll();
    }

    @Transactional
    public String addBook(Library book) {
        libraryRepo.save(book);
        return "Book Added Successfully";
    }

    public List<Library> getBooks() {
        return libraryRepo.findAll();
    }

    public List<Student> getStdByBook(Library book) {
        List<Student>library = studentRepo.findByBook(book);
//        return studentRepo.findByBook(book);
        System.out.println(library);
        return library;
    }
}
