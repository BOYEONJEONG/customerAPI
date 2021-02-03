package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService CustomerService;

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Customer> getCustomer(){
		List<Customer> customerList = CustomerService.getCustomer();
		return customerList;
	}

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void addCustomer(){
		
		CustomerService.addCustomer();
		return;
	}
}
