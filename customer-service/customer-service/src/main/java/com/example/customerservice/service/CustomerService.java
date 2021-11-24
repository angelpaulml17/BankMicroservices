package com.example.customerservice.service;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository custRepository;

    public CustomerService(CustomerRepository custRepository) {
        this.custRepository = custRepository;
    }

    public List<Customer> getAll() {
        return custRepository.findAll();
    }

    public Customer get(String customerID) {
        return custRepository.findById(customerID).orElse(null);
    }


    public Customer create(Customer book) {
        return custRepository.save(book);
    }

    public void delete(String customerID) {
    	custRepository.deleteById(customerID);
    }

    public Customer update(Customer customer, String customerID) {
    	Customer customer1 = custRepository.findById(customerID).get();
    	customer1.setCustomer_name(customer.getCustomer_name());
    	customer1.setAge(customer.getAge());
    	customer1.setAccount_number(customer.getAccount_number());
        custRepository.save(customer1);
        return customer1;
    }

    public void deleteAll() {
    	custRepository.deleteAll();
    }
}
