package com.sb.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sb.spring.springmvc.dto.User;

@Controller
public class RequestParmsController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email) {
		ModelAndView modelandview = new ModelAndView();
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email" + email);
		modelandview.setViewName("regSuccess");
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		modelandview.addObject(user);
		return modelandview;
	}

}
