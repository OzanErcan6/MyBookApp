package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Customer;
import com.ercan.MyBookApp.jpaRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Additional methods for saving, updating, and deleting customer entities

}
