package com.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	private EmployeeService service;

	@ResponseBody
	@GetMapping("/homePage")
	public String getHomePage() {
		return "Welcome to home page";
	}

	
	@ResponseBody
	@GetMapping("/getEmployeeDetails")
	public List<Employee> getEmployeeDetails() {
		List<Employee> empList = service.getAllEmployees();
		System.out.println(empList);
		return empList;
	}

	@ResponseBody
	@GetMapping("/getEmployeeDetails/{name}")
	public Employee getEmployee(@PathVariable("name") String name) {
		Employee emp = service.getEmployeeByName(name);
		System.out.println(emp);
		return emp;
	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}
	
}

