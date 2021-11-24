package com.example.customerservice.controller;

import com.example.customerservice.model.Customer;
import com.example.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/customer")
@RestController
public class CustomerController {
    private final CustomerService custService;

    public CustomerController(CustomerService custService) {
        this.custService = custService;
    }

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return custService.getAll();
    }

    @GetMapping("/get/{customerID}")
    public Customer get(@PathVariable String customerID) {
        return custService.get(customerID);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return custService.create(customer);
    }

    @DeleteMapping("/delete/{customerID}")
    public String delete(@PathVariable String customerID) {
    	custService.delete(customerID);
        return "Customer Deleted";
    }

    @PutMapping("/update/{customerID}")
    public Customer update(@RequestBody Customer customer, @PathVariable String customerID) {
        return custService.update(customer, customerID);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
    	custService.deleteAll();
        return "All Customers data deleted";
    }
}