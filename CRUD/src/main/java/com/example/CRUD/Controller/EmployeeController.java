package com.example.CRUD.Controller;

import com.example.CRUD.Model.Employee;
import com.example.CRUD.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public String createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{eid}")
    public Optional<Employee> getEmployeeById(@PathVariable String eid){
        return employeeService.getEmployeeById(eid);
    }

    @PutMapping("/{eid}")
    public String updateEmployee(@PathVariable String eid,@RequestBody Employee employee){
//        employee.setEid(eid);
        return employeeService.updateEmployee(eid,employee);
    }

    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable String eid){
        return employeeService.deleteEmployee(eid);
    }

    @GetMapping("/employeeRoleSal")
    public List<Employee> getEmployeeByRoleAndSal(@RequestParam("role") String role,@RequestParam("salary") int salary){
        return employeeService.getEmployeeByRoleAndSal(role,salary);
    }

    @GetMapping("/employeeRoleAndInbwSal")
    public List<Employee> getEmployeeByRoleAndInbwSal(@RequestParam("role") String role,@RequestParam("minSal") Integer minSal,@RequestParam("maxSal") Integer maxSal){
        return employeeService.getEmployeeByRoleAndInbwSal(role,minSal,maxSal);
    }

    @GetMapping("/search/{ename}")
    public List<Employee> searchByName(@PathVariable String ename){
        return employeeService.searchByName(ename);
    }
}
