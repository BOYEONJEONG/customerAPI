package com.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;
import com.customer.model.request.UpdateCustomerReqeuset;

@Repository
@Mapper
public interface CustomerMapper {
	List<Customer> getCustomer();
	Customer detailCustomer(int id);
	void addCustomer(Customer customer);
	void deleteCustomer(int id);
	void updateCustomer(UpdateCustomerReqeuset request);
}
