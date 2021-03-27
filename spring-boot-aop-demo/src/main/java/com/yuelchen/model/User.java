package com.yuelchen.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Getter 
	private int id;
	
	@Getter @Setter 
	private String firstName;
	
	@Getter @Setter 
	private String lastName;
	
	@Getter @Setter 
	private int clearance;
	
	public User() {
		this.clearance = 1;
	}
	
	public User(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	@Override
	public String toString() {
		return String.format("[%d] first name = '%s', last name = '%s', clearance = '%d'", 
				this.id, this.firstName, this.lastName, this.clearance);
	}
}