package com.mrityunjay.SecureApplication.Validator;

public class Validator {

	public static boolean validateCustomerId(Long customerId) {
		if(customerId>99L && customerId<1000L) 
			return true;
		return false;
	}
	
	public static boolean validateName(String name) {
		if(name.length()<10 && name.length()>2) 
			return true;
		return false;
	}
	public static boolean validatePincode(Long pincode) {
		if(pincode>9999 && pincode< 1000000) 
			return true;
		return false;
	}
	public static boolean validateAddress(String address) {
		if(address.length()<15 && address.length()>3)
			return true;
		return false;
	}
	public static boolean validatePassword(String password) {
		if(password.length()<10 && password.length()>2) 
			return true;
		return false;
	}
}
