package com.landisgyr.employeemanagementsystem.repository;

import com.landisgyr.employeemanagementsystem.dto.Employee;

public class EmployeeRepository {
	
	private Employee employees[] = new Employee[10];
	static int counter = 10;// to create a single copy of counter we are using static
	
	public String addEmployee(Employee employee) {
		
		//to check occupancy of an array
		if(counter<10) {
			 //we can allow adding the object in an array
		     employees[counter] = employee;
		     counter++;
		     return "success";
		}
		else {
			
			return "arrayisFull";
		}
	
	}
		
		//just to check the size of an array
		/*System.out.println("length"+employees.length);
		return "success";*/
		
	public Employee[] getEmployees() {
		return employees;
	}
		
	public Employee getEmployeeById(String empId) {
		for(Employee employee : employees) {
			if(employee!=null && empId.equals(employee.getEmpId())) {
			return employee;
			}
		}
		return null;
	}
	
	//DELETE
	public String deleteEmployeeById(String empId){
		for(int i = 0; i<employees.length; i++) {
			if(empId.equals(employees[i].getEmpId())) {
				employees[i] = null;
				return "success";
			}
		}
		return "not found";
	}
		
	}
	
	


