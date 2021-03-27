package com.yuelchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String greet(Model model) {
		model.addAttribute("name", "World");
		return "index";
	}
	
	@RequestMapping(value="/{name}")
	public String greetWithName(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
}