package com.sb.spring.springmvc.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sb.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("displayList");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String empName;
		for(int i = 0; i<10; i++)
		{
			Employee employee = new Employee();
			empName="emp"+(i+1);
			employee.setId(++i);
			employee.setName(empName);
			employee.setSalary(Math.pow(i, i));
			employees.add(employee);
		}
		modelandView.addObject("employees", employees);
		return modelandView;
	}
}
