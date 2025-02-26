package com.example.CRUD.Service;

import com.example.CRUD.Model.Employee;
//import com.example.CRUD.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.CodecRegistryProvider;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.regex.Pattern;

@Service
public class EmployeeService {

//    @Autowired
//    EmployeeRepo employeeRepo;
    @Autowired
    MongoTemplate mongoTemplate;

    public String createEmployee(Employee employee) {
//        employeeRepo.save(employee);
        mongoTemplate.save(employee);
        return "Employee added Successfully";
    }

    public List<Employee> getAllEmployee() {
//        return employeeRepo.findAll();
        return mongoTemplate.findAll(Employee.class);
    }

    public Optional<Employee> getEmployeeById(String eid) {
//        return employeeRepo.findById(eid);
        Query query=new Query(Criteria.where("eid").is(eid));
        Employee employee=mongoTemplate.findOne(query, Employee.class);
        return Optional.ofNullable(employee);
    }

    public String updateEmployee(String eid,Employee employee) {
        Query query=new Query(Criteria.where("eid").is(eid));
        Employee existingEmployee=mongoTemplate.findOne(query, Employee.class);
        if (existingEmployee != null) {
            existingEmployee.setEname(employee.getEname());
            existingEmployee.setRole(employee.getRole());
            existingEmployee.setSalary(employee.getSalary());
            mongoTemplate.save(existingEmployee);
            return "Employee updated successfully!";
        } else {
            return "Employee not found!";
        }

//        Optional<Employee> existingEmployee = employeeRepo.findById(eid);
//        if (existingEmployee.isPresent()) {
//            employee.setEid(eid);
//            employeeRepo.save(employee);
//            return "Employee updated successfully!";
//        } else {
//            return "Employee not found!";
//        }
//        employeeRepo.save(employee);
//        return "Employee Updated Successfully";
    }

    public String deleteEmployee(String eid) {
        Query query=new Query(Criteria.where("eid").is(eid));
        mongoTemplate.remove(query, Employee.class);
        return "Employee deleted Successfully";
//        if (employeeRepo.existsById(eid)) {
//            employeeRepo.deleteById(eid);
//            return "Employee deleted successfully!";
//        } else {
//            return "Employee not found!";
//        }

//        employeeRepo.deleteById(eid);
//        return "Employee Deleted Successfully";
    }

    public List<Employee> getEmployeeByRoleAndSal(String role, int salary) {
        Query query=new Query();
        query.addCriteria(new Criteria().andOperator(
                Criteria.where("role").in(role),
                Criteria.where("salary").gte(salary)
        ));
        return mongoTemplate.find(query,Employee.class);

    }


    public List<Employee> getEmployeeByRoleAndInbwSal(String role, Integer minSal, Integer maxSal) {
        List<Criteria> criteria=new ArrayList<>();
        if(role!=null)
            criteria.add(Criteria.where("role").is(role));
        if(minSal!=null)
            criteria.add(Criteria.where("salary").gte(minSal));
        if(maxSal!=null)
            criteria.add(Criteria.where("salary").lte(maxSal));
        Query query=new Query(new Criteria().andOperator(criteria.toArray(new Criteria[0])));
        System.out.println(query.addCriteria(new Criteria("salary").is(maxSal)));
        return mongoTemplate.find(query, Employee.class);
    }


    public List<Employee> searchByName(String ename) {
       // String name=ename.replaceAll("[^a-zA-Z]","");
        //Query query=new Query(Criteria.where("ename").regex(".*"+name+".*","i"));
     Query query=new Query(Criteria.where("ename").regex(Pattern.quote(ename),"i"));

        query.addCriteria(Criteria.where("ename").regex("an","i"));

         List<Employee> employee= mongoTemplate.find(query, Employee.class);


        return employee;
    }
}
