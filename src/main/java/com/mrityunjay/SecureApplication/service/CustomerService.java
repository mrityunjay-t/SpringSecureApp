package com.mrityunjay.SecureApplication.service;

import java.util.List;

import com.mrityunjay.SecureApplication.model.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer getCustomer(Long customerId);
	public void updateCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer deleteCustomer(Long customerId);
}
