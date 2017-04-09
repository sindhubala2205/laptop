package com.niit.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class appController {
	@RequestMapping("/")
	public String showHome(){
		return "index";
	}
	@RequestMapping("product")
	public String showproduct(){
		return "product";
	}
	@RequestMapping("aboutus")
	public String showaboutus(){
		return "aboutus";
	}
	@RequestMapping("b")
	public String b(){
		return "b";
	}
	
	@RequestMapping("contactus")
	public String contactus(){
		return "contactus";
	}
	@RequestMapping("homepage")
	public String homepage(){
		return "homepage";
	}
	@RequestMapping("login")
	public String login(){
		return "login";
	}
	@RequestMapping("Logo")
	public String Logo(){
		return "Logo";
	}
	@RequestMapping("order")
	public String order(){
		return "order";
	}
	@RequestMapping("registration")
	public String registration(){
		return "registration";
	}
}


	