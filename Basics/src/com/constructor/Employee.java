package com.constructor;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int id,String name,double salary) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeSalary=salary;
		
	}
	public Employee() {
		
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		Employee e=new Employee(1,"bhuvana",300000.009);
		System.out.println(e.employeeId+"---"+e.employeeName+"---"+e.employeeSalary);
		Employee e1=new Employee();
		
	}

}
