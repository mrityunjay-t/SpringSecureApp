//package com.mrityunjay.SecureApplication.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.mrityunjay.SecureApplication.model.Customer;
//
//@Repository
//public interface CustomerDAO extends JpaRepository<Customer, Long>{
//	
////	@Modifying
////	@Query("Update customer set address=?2, pincode=?3 where customer_id = ?1")
////	void updateCustomer(Long customerId, String address, Long pincode);
//	
//}

package com.mrityunjay.SecureApplication.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mrityunjay.SecureApplication.model.Customer;

@Repository
public class CustomerDAO{
	
	public Customer saveAndFlush() {
		
		Customer customer = new Customer();
		customer.setName("john");
		customer.setPassword("John@123");
		customer.setCustomerId(123L);
		customer.setAddress("Delhi, India");
		customer.setPincode(12345L);
		
		return customer;
	}
	
	public Customer findById(Long customerId) {
		Customer customer = new Customer();
		customer.setName("john");
		customer.setPassword("John@123");
		customer.setCustomerId(customerId);
		customer.setAddress("Delhi, India");
		customer.setPincode(12345L);
		
		return customer;
	}
	
	public List<Customer> findAll() {
		
		List<Customer> customerList = new ArrayList<>();
		
		for(int i=100; i<105; i++) {
			Customer customer = new Customer();
			customer.setName("john");
			customer.setPassword("John@123");
			customer.setCustomerId(new Long(i));
			customer.setAddress("Delhi, India");
			customer.setPincode(12345L);
			
			customerList.add(customer);
		}
		return customerList;
	}
	
	public Customer deleteById(Long customerId) {
		
		Customer customer = new Customer();
		customer.setName("john");
		customer.setPassword("John@123");
		customer.setCustomerId(customerId);
		customer.setAddress("Delhi, India");
		customer.setPincode(12345L);
		
		return customer;
	}

}