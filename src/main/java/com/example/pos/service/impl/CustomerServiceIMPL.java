package com.example.pos.service.impl;

import com.example.pos.dto.CustomerDTO;
import com.example.pos.entity.Customer;
import com.example.pos.repo.CustomerRepo;
import com.example.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setCustomerAddress(customerDTO.getCustomerAddress());
        customer.setCustomerSalary(customerDTO.getCustomerSalary());
        customer.setContactNumbers(customerDTO.getContactNumbers());
        customer.setNic(customerDTO.getNic());
        customer.setActiveState(customerDTO.isActiveState());

        customerRepo.save(customer);
    }
}
