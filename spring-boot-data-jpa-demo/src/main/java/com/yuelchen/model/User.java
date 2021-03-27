package com.yuelchen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USERS")  
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Getter 
	private int id;
	
	@Column(unique = true) @Getter @Setter 
	private String username;
	
	@Getter @Setter 
	private String firstName;
	
	@Getter @Setter 
	private String lastName;
	
	// default class constructor
	public User() { }
	
	public User(String username, String first, String last) {
		this.username = username;
		this.firstName = first;
		this.lastName = last;
	}

	@Override
	public String toString() {
		return String.format("[%d - %s] First Name = '%s', Last Name = '%s'", 
				this.id, this.username, this.firstName, this.lastName);
	}
}
