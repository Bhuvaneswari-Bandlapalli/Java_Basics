package com.courseArray;
import java.util.*;
public class TestFile {

	public static void main(String[] args) {
		Course c1=new Course(1,"java",20000.000);
		Course c2=new Course(2,"Hybernet",15000.000);
		Course c3=new Course(3,"Spring",5000.000);
		ArrayList<Course> b=new ArrayList<>();
		b.add(c1);
		b.add(c2);
		b.add(c3);
		Student student =new Student(101,"bhuvana",23,b);
		System.out.println(student);
		
	}

}
