package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.User;
import com.niit.services.UserServices;
@Controller

public class UserController {
	@Autowired
	private UserServices userservices;
	@RequestMapping(value="/register")
		public ModelAndView addUser()
		{
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("user",new User());
		return modelandview;
	}
	
	@RequestMapping(value="/add") 
	public ModelAndView add(@ModelAttribute User user)
	{
		ModelAndView modelandview = new ModelAndView();
		userservices.add(User);
		
		modelandview.addObject("user",new User());
		return modelandview;
	}
	
	 }
