package com.yuelchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public @ResponseBody String greeting() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "/{name}")
	public @ResponseBody String greetingWithName(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}