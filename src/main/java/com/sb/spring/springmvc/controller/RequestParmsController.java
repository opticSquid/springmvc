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
			@RequestParam(value = "email", required = false) String email) {
		// By default every query param is required so to make some query param optional
		// we have to provide required=false and and add value="<param_key>" in
		// RequestParam annotation
		// if the data type is a primitive type and no param value comes in for an
		// optional parameter it results in an error saying null can not be assigned to
		// a primitive data type. In that case you have to provide another parameter
		// called "defaultValue"="some value of same data type"
		ModelAndView modelandview = new ModelAndView();
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		modelandview.setViewName("regSuccess");
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		modelandview.addObject(user);
		return modelandview;
	}

}
