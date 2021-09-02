package com.employee.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Employee {

	private String name;
	private String id;
	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String name, String id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
	}

}
