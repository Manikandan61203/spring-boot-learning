package com.example.Mapping.Controller;

import com.example.Mapping.DTO.OrderRequest;
import com.example.Mapping.Model.Customer;
import com.example.Mapping.Repository.CustomerRepo;
import com.example.Mapping.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ProductRepo productRepo;
    @PostMapping("placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepo.save(request.getCustomer());
    }
    @GetMapping("findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepo.findAll();
    }
}
