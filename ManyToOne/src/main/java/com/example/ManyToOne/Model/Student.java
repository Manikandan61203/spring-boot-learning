package com.example.ManyToOne.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int sid;
    private String sname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bid",nullable = false)
    private Library book;

    public Student() {
    }

    public Student(int sid, String sname, Library book) {
        this.sid = sid;
        this.sname = sname;
        this.book = book;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Library getBook() {
        return book;
    }

    public void setBook(Library book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", book=" + book +
                '}';
    }
}
