package com.constructorOne;

public class Test {
	
	public static void main(String[] args) {
		
		Course cc=new Course(1,"java",23.90);
		Student s=new Student(1,"bhuvana",23,cc);
		System.out.println(s);
	}

}
