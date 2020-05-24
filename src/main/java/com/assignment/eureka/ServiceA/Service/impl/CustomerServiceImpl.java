package com.assignment.eureka.ServiceA.Service.impl;

import com.assignment.eureka.ServiceA.Model.Customer;
import com.assignment.eureka.ServiceA.Repository.CustomerRepository;
import com.assignment.eureka.ServiceA.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        super();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer> getCustomer(int id) {
        return customerRepository.findById(id);
    }
}
