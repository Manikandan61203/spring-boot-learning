//package com.example.ManyToOne.Runner;
//
//import com.example.ManyToOne.Model.Library;
//import com.example.ManyToOne.Repository.LibraryRepo;
//import com.example.ManyToOne.Repository.StudentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestRunner implements CommandLineRunner {
//
//    @Autowired
//    StudentRepo studentRepo;
//    @Autowired
//    LibraryRepo libraryRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Library book1=new Library(101,"HarryPotter");
//        Library book2=new Library(102,"IronSteelWizard");
//        Library book3=new Library(103,"Dungeons and Dragons");
//
//        libraryRepo.save(book1);
//        libraryRepo.save(book2);
//        libraryRepo.save(book3);
//    }
//}
