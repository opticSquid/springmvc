package com.sb.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		// Returning just the view name as String not any model
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "regSuccess";
	}
}
