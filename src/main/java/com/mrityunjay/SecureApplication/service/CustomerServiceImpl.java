package com.mrityunjay.SecureApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.mrityunjay.SecureApplication.Validator.Validator;
import com.mrityunjay.SecureApplication.dao.CustomerDAO;
import com.mrityunjay.SecureApplication.exception.SecureApplicationException;
import com.mrityunjay.SecureApplication.model.Customer;

@Service
@PropertySource("classpath:user.properties")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		if(!Validator.validateCustomerId(customer.getCustomerId()))
			throw new SecureApplicationException("INVALID_CUSTOMER_ID");
		if(!Validator.validateAddress(customer.getAddress())) 
			throw new SecureApplicationException("INVALID_ADDRESS");
		if(!Validator.validatePassword(customer.getPassword())) 
			throw new SecureApplicationException("INVALID_PASSWORD");
		if(!Validator.validateName(customer.getName())) 
			throw new SecureApplicationException("INVALID_NAME");
		if(!Validator.validatePincode(customer.getPincode())) 
			throw new SecureApplicationException("INVALID_PINCODE");
		
//		Optional<Customer> customerFromDB = customerDAO.findById(customer.getCustomerId());
//		if(customerFromDB.get() != null)
//			throw new SecureApplicationException("CUSTOMER_ALREADY_IN_DB");
		return customerDAO.saveAndFlush();
	}

	@Override
	public Customer getCustomer(Long customerId) {
		
		if(!Validator.validateCustomerId(customerId))
			throw new SecureApplicationException("INVALID_CUSTOMER_ID");
		Customer customer = customerDAO.findById(customerId);
		
		if(customer == null) 
			throw new SecureApplicationException("CUSTOMER_NOT_FOUND");
		
		return customer;
	}

//	@Override
//	public void updateCustomer(Customer customer) {
//		if(!Validator.validateCustomerId(customer.getCustomerId()))
//			throw new SecureApplicationException("INVALID_CUSTOMER_ID");
//		if(!Validator.validateAddress(customer.getAddress())) 
//			throw new SecureApplicationException("INVALID_ADDRESS");
//		if(!Validator.validatePincode(customer.getPincode())) 
//			throw new SecureApplicationException("INVALID_PINCODE");
//		
//		customerDAO.updateCustomer(customer.getCustomerId(), 
//				customer.getAddress(), customer.getPincode());
//	}
	

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDAO.findAll();
	}

	@Override
	public Customer deleteCustomer(Long customerId) {
		
		if(!Validator.validateCustomerId(customerId))
			throw new SecureApplicationException("INVALID_CUSTOMER_ID");
//		Customer customer = customerDAO.findById(customerId).get();
//		if(customer ==null)
//			throw new SecureApplicationException("CUSTOMER_NOT_FOUND");
		Customer customer = customerDAO.deleteById(customerId);
		
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
