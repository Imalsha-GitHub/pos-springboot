package com.example.pos.service;

import com.example.pos.dto.CustomerDTO;

public interface CustomerService {

    void addCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerDTO customerDTO);
}
