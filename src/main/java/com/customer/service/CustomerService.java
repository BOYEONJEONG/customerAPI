package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.mapper.CustomerMapper;
import com.customer.model.Customer;

@Service
public class CustomerService {

	@Autowired
	public CustomerMapper mapper;
	
	public List<Customer> getCustomer(){
		System.out.println("in service");
		System.out.println("in service" + mapper.getCustomer());
		
		return mapper.getCustomer();
	}
}
