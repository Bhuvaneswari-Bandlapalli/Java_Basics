package com.constructor;

public class Student {
	private int studentId;
	private String studentname;
	private String studentDesignation;
	private double studentSalary;
	 
	public Student(int studentId, String studentname, String studentDesignation, double studentSalary) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentDesignation = studentDesignation;
		this.studentSalary = studentSalary;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentDesignation="
				+ studentDesignation + ", studentSalary=" + studentSalary + "]";
	}


	public static void main(String[] args) {
		Student s=new Student(1,"bhuvana","b.tech",30000.009);
		System.out.println();
		System.out.println(s);

	}

}
