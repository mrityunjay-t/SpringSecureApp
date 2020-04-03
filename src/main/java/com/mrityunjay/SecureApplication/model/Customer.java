//package com.mrityunjay.SecureApplication.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="customer")
//public class Customer {
//	@Id
//	@Column(name="customer_id")
//	private Long customerId;
//	private String password;
//	private String name;
//	private String address;
//	private Long pincode;
//	public Long getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(Long customerId) {
//		this.customerId = customerId;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public Long getPincode() {
//		return pincode;
//	}
//	public void setPincode(Long pincode) {
//		this.pincode = pincode;
//	}
//	@Override
//	public String toString() {
//		return "Customer [customerId=" + customerId + ", password=" + password + ", name=" + name + ", address="
//				+ address + ", pincode=" + pincode + "]";
//	}
//	
//	
//}

package com.mrityunjay.SecureApplication.model;


public class Customer {
	
	private Long customerId;
	private String password;
	private String name;
	private String address;
	private Long pincode;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", password=" + password + ", name=" + name + ", address="
				+ address + ", pincode=" + pincode + "]";
	}
	
	
}

