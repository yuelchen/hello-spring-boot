package com.yuelchen.service;

import org.springframework.stereotype.Service;

import com.yuelchen.model.User;

@Service  
public class UserService {

	public User createUser(String first, String last) {
		return new User(first, last);
	}
	
	public User createUser(String first, String last, int clearance) {
		User user = new User(first, last);
		user.setClearance(clearance);
		return user;
	}
	
	public String displayRegionOffice() {
		String message = "Unable to determine office as region is unknown.";
		System.out.println(message);
		
		return message;
	}
	
	public String displayRegionOffice(String region) {
		
		String office = "International";
		if(region.equalsIgnoreCase("us-east-1")) {
			office = "DC";
			
		} else if(region.equalsIgnoreCase("us-east-2")) {
			office = "Ohio";		
			
		} else if(region.equalsIgnoreCase("us-west-1")) {
			office = "California";		
			
		} else if(region.equalsIgnoreCase("us-west-2")) {
			office = "Oregon";		
			
		} 
		
		String message = String.format("User reports to the %s office.", office);
		System.out.println(message);
		
		return message;
	}
	
	public boolean validPay(double compensation) throws Exception {
		if(compensation < 50000.00) {
			return false;
		} else if(compensation > 150000.00) {
			throw new Exception("Compensation exceeds maximum limit allowed: " + compensation);
		} 
		
		return true;
	}
}