package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeService {

	List<Employee> employeeList;
	
	public EmployeeService(){
		employeeList = new ArrayList();
		employeeList.add(new Employee("Rohan", "101", "Testing"));
		employeeList.add(new Employee("Mohan", "102", "Networking"));
	}
	
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public Employee getEmployeeByName(String name) {
		return employeeList.stream().filter(employee -> employee.getName().equals(name)).findFirst().get();
	}
}
