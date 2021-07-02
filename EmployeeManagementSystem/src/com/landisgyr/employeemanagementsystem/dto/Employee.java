package com.landisgyr.employeemanagementsystem.dto;

import lombok.Data;

@Data
public class Employee {
	
	private String empId;
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	private String permanentAddress;
	private String currentAddress;
	private String empLocation;
	
	public Employee(String empId, String empFirstName, String empLastName, float empSalary, String permanentAddress) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.permanentAddress = permanentAddress;
	}
	
	public Employee() {
		
	}
	

}
