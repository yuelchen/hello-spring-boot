package com.yuelchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuelchen.model.User;
import com.yuelchen.service.UserService;

@RestController  
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET, params = {"first", "last"})  
	public User addUser(@RequestParam("first") String first, 
			@RequestParam("last") String last) {
		return service.createUser(first, last);
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET, params = {"first", "last", "clearance"})  
	public User addUser(@RequestParam("first") String first, 
			@RequestParam("last") String last, 
			@RequestParam("clearance") int clearance) {
		return service.createUser(first, last, clearance);
	}
}
