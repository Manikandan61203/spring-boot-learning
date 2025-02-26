package com.example.CRUD.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document
public class Employee {
    @Id
    private String eid;
    private String ename;
    private String role;
    private int salary;

    public Employee() {
    }

    public Employee(String eid, String ename, String role, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.role = role;
        this.salary = salary;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
