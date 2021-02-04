package com.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.model.Customer;
import com.customer.model.request.DeleteCustomerRequest;
import com.customer.model.request.UpdateCustomerReqeuset;
import com.customer.service.CustomerService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	@RequestMapping(value = "/detail", method = RequestMethod.GET, produces = "application/json")
	public Customer detailCustomer(HttpServletRequest request){
		//HttpServletRequest
		Customer customer = CustomerService.detailCustomer(Integer.parseInt(request.getParameter("id")));
		return customer;
	}

	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.PUT, produces = "application/json")
	public void deleteCustomer(@RequestBody DeleteCustomerRequest request){
		//RequestBody(POST, PUT, PATCH + DELETE, GET)
		CustomerService.deleteCustomer(request.getId());
		return ;
	}

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public void addCustomer(@RequestBody Customer customer){
		CustomerService.addCustomer(customer);
		return;
	}

	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public void addCustomer(@RequestBody UpdateCustomerReqeuset request){
		CustomerService.updateCustomer(request);
		return;
	}
}
