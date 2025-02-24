package com.example.ManyToOne.Controller;

import com.example.ManyToOne.Model.Library;
import com.example.ManyToOne.Model.Student;
import com.example.ManyToOne.Repository.LibraryRepo;
import com.example.ManyToOne.Repository.StudentRepo;
import com.example.ManyToOne.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("addStudent")
    public String addStudents(@RequestBody Student student){
        return bookService.addStudents(student);
    }

    @GetMapping("getStudents")
    public List<Student> getStd(){
        return bookService.getStd();
    }

    @PostMapping("addBook")
    public String addBook(Library book) {
        return bookService.addBook(book);
    }

    @GetMapping("getBooks")
    public List<Library> getBooks(){
        return bookService.getBooks();
    }
}
