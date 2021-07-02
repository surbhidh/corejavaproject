package com.landisgyr.employeemanagementsystem.service;

import com.landisgyr.employeemanagementsystem.dto.Employee;
import com.landisgyr.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {
	
	//created repo object
	EmployeeRepository employeeRepository = new EmployeeRepository();
	
	public String addEmployee(Employee employee){
		return employeeRepository.addEmployee(employee);
	}

	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}
	
	public Employee getEmployeeById(String empId) {
		return employeeRepository.getEmployeeById(empId);
	}
	
	public String deleteEmployeeById(String empId) {
		return employeeRepository.deleteEmployeeById(empId);
		}
}
