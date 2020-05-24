package com.assignment.eureka.ServiceA.Controller;

import com.assignment.eureka.ServiceA.Model.Customer;
import com.assignment.eureka.ServiceA.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@EnableEurekaClient
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @LoadBalanced
    @GetMapping(path = "/getADetails")
    public Optional<Customer> getCustomer(@RequestParam int id){
        return customerService.getCustomer(id);
    }
}
