package com.yuelchen.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class User {
	
	private String email;
	
	private String username;

	private String firstName;
	
	private String lastName;
	
	public User(String email, String username) {
		this.email = email;
		this.username = username;
		this.firstName = "";
		this.lastName = "";
	}
	
	public User(String email, String username, String firstName) {
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = "";
	}
	
	public User(String email, String username, String firstName, String lastName) {
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
