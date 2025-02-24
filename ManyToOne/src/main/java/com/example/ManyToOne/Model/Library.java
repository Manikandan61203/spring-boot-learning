package com.example.ManyToOne.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Library {
    @Id
    private int bid;
    private String bname;

    public Library() {
    }

    public Library(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}
