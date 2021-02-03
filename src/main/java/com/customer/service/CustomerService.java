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
		return mapper.getCustomer();
	}
	
	public void addCustomer() {
		
		Customer customer = new Customer();
		customer.setId(3);
		customer.setFirst_name("boyeon");
		customer.setLast_name("Jeong");
		customer.setPhone("010-1234-1234");
		customer.setEmail("email@email.com");
		customer.setAddress("address123");
		customer.setCity("city1234");
		customer.setState("state123");
		
		mapper.addCustomer(customer);
		
		return;
	}
}
