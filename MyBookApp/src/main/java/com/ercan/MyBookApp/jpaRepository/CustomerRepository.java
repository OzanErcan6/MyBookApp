package com.ercan.MyBookApp.jpaRepository;

import com.ercan.MyBookApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}



