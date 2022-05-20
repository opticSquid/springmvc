package com.sb.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sb.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("registrationPage")
	public ModelAndView showRegistration() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("userReg");
		return modelandview;
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("userReg");
		return modelandview;
	}
}
