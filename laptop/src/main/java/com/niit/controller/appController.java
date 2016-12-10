package com.niit.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class appController {
	@RequestMapping("/")
	public String showHome(){
		return "index";
	}

}
