package com.example.ManyToOne.Controller;

import com.example.ManyToOne.Model.Library;
import com.example.ManyToOne.Model.Student;
import com.example.ManyToOne.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("getStudents/id")
    public List<Student> getStdByBook(@RequestBody Library book){

        return bookService.getStdByBook(book);
    }

    @PostMapping("addBook")
    public String addBook(@RequestBody Library book) {
        return bookService.addBook(book);
    }

    @GetMapping("getBooks")
    public List<Library> getBooks(){
        return bookService.getBooks();
    }


}
