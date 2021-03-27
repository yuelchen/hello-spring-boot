package com.yuelchen.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yuelchen.model.User;
import com.yuelchen.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/users")  
	public List<User> getUsers() {
		long startTime = System.nanoTime();
		List<User> users = service.getDefaultUsers();
		
		long elapsedTime = (System.nanoTime() - startTime) / 1000;
		System.out.println("GET Users Elapsed Time: " + elapsedTime + " milliseconds");
		
		return users;
	}
	
	@RequestMapping("/users/clear")
	public void clearUsers() {
		long startTime = System.nanoTime();
		service.clearAllUsers();
		
		long elapsedTime = (System.nanoTime() - startTime) / 1000;
		System.out.println("CLEAR Users Elapsed Time: " + elapsedTime + " milliseconds");
	}
}