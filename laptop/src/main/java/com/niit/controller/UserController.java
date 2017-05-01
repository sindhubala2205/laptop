package com.niit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.User;
import com.niit.services.UserServices;

@Controller
public class UserController {

	@Autowired
	private UserServices userServices;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String register(Map<String, Object> map) {
		map.put("user", new User());
		return "registration";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user, Map<String, Object> map) {
		userServices.add(user);
		return "redirect:details/" + user.getUserId();
	}

	@RequestMapping(value = "/details/{cid}", method = RequestMethod.GET)
	public String details(@PathVariable("cid") int cid, Map<String, Object> map) {
		User user = userServices.getUser(cid);
		map.put("fname", user.getName());
		map.put("email", user.getEmail());
		map.put("phone_no", user.getPhone_no());
		return "details";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String details(User user, Map<String, Object> map) {
		map.put("userList", userServices.getAllUser());
		return "/list";
	}

	@RequestMapping(value = "/edit/{cid}", method = RequestMethod.GET)
	public String edit(@PathVariable("cid") int cid, Map<String, Object> map) {
		User user = userServices.getUser(cid);
		map.put("user", user);
		return "edit";
	}

	@RequestMapping(value = "edit/update", method = RequestMethod.POST)
	public String update(User user, Map<String, Object> map) {
		userServices.update(user);
		return "redirect:/details/" + user.getUserId();
	}

	@RequestMapping(value = "/delete/{cid}", method = RequestMethod.GET)
	public String delete(@PathVariable("cid") int cid, Map<String, Object> map) {
		userServices.delete(cid);
		return "redirect:/list";
	}

}