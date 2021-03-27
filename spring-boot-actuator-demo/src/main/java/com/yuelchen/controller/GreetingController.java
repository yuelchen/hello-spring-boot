package com.yuelchen.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greet() {
		return "Hello User!";
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String greetWithName(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}