package com.yuelchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yuelchen.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)    
	public ModelAndView add(@ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();   
		mv.setViewName("users");       
		mv.addObject("user", user);
		return mv;
	}
}
