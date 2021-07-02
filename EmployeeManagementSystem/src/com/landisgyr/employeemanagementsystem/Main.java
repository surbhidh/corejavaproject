package com.landisgyr.employeemanagementsystem;

import com.landisgyr.employeemanagementsystem.dto.Employee;
import com.landisgyr.employeemanagementsystem.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("9201","Surbhi","Dhanetwal",123.0f,"jaipur"); //DC
	//	employee.setEmpId("ab001");
	//	employee.setEmpFirstName("Surbhi");
	//	employee.setEmpLastName("Dhanetwal");
		
//		String id =employee.getEmpId();
//		String fname =employee.getEmpFirstName();
//				
//		System.out.println("id="+id);
//		System.out.println("firstName="+fname);
//		System.out.println(employee);
//		System.out.println(employee.toString());
		
		
		EmployeeService employeeService = new EmployeeService();
		for(int i=0;i<=10;i++) {
			String result = employeeService.addEmployee(employee);
			System.out.println(result);
			}
		
		Employee[] employees = employeeService.getEmployees();
		//foreach
		for(Employee employee2 : employees) {
			System.out.println(employee2);
		}
		
		Employee employee3 = employeeService.getEmployeeById("9201");
		if(employee!=null) {
			System.out.println("employee details" + employee3);
		}
		else {
			System.out.println("employee not found");
		}
		
		String employee4 = employeeService.deleteEmployeeById("9201");
		if()
		
		
		
		
	}

}
