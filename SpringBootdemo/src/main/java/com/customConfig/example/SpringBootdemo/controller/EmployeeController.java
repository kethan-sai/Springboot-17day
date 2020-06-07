package com.customConfig.example.SpringBootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customConfig.example.SpringBootdemo.model.Employee;


@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","java@gmail.com"));
		employeesList.add(new Employee(2,"loki","iron","javaSpring@gmail.com"));
		return employeesList;
    }

}
