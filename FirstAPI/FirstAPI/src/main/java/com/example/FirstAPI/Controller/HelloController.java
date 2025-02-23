package com.example.FirstAPI.Controller;

import com.example.FirstAPI.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService service;
    @GetMapping("/")
    public String greet(){
        return service.greedy();
    }

//    @GetMapping("about")
//    public String aboutUs() {
//        return "SpringBoot Developer Manikandan";
//    }
}
