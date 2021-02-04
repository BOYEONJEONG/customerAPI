package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.mapper.CustomerMapper;
import com.customer.model.Customer;
import com.customer.model.request.UpdateCustomerReqeuset;

@Service
public class CustomerService {

	@Autowired
	public CustomerMapper mapper;
	
	public List<Customer> getCustomer(){
		return mapper.getCustomer();
	}
	
	public Customer detailCustomer(int id) {
		return mapper.detailCustomer(id);
	}
	
	public void deleteCustomer(int id) {
		mapper.deleteCustomer(id);
		return ;
	}
	
	public void addCustomer(Customer customer) {
		mapper.addCustomer(customer);
		return;
	}
	
	public void updateCustomer(UpdateCustomerReqeuset request) {
		mapper.updateCustomer(request);
		return;
	}
}
