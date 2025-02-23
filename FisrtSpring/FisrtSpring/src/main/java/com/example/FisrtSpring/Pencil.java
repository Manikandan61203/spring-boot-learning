package com.example.FisrtSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer{
    public void write(){
        System.out.println("Writing using my pencil");
    }
}
