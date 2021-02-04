package com.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

@Repository
@Mapper
public interface CustomerMapper {
	List<Customer> getCustomer();
	Customer detailCustomer(int index);
	void addCustomer(Customer customer);
}
