package com.sb.spring.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sb.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("sb");
		employee.setSalary(100.00);
		modelandView.addObject("employee", employee);
		return modelandView;
	}
}
