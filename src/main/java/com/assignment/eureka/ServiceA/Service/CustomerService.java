package com.assignment.eureka.ServiceA.Service;

import com.assignment.eureka.ServiceA.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public List<Customer> getAllCustomers();
    public Optional<Customer> getCustomer(int id);

}
