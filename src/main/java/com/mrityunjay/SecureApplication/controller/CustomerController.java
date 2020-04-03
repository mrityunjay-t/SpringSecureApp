package com.mrityunjay.SecureApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.SecureApplication.model.Customer;
import com.mrityunjay.SecureApplication.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomer(){
		List<Customer> customerList = customerService.getAllCustomers();
		System.out.println(customerList);
		return customerList;
	}
	
	@GetMapping("/getCustomer")
	public Customer getCustomer(@RequestParam Long customerId) {
		Customer customer = customerService.getCustomer(customerId);
		System.out.println(customer);
		return customer;
	}
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/deleteCustomer") 
	public void deleteCustomer(@RequestParam Long customerId){
		customerService.deleteCustomer(customerId);
	}
}
