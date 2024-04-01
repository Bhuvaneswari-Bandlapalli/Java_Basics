package com.courseStudent;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Course c=new Course();
		c.setcId(1);
		c.setcName("java");
		c.setcFee(40000.000);
		Course c1=new Course();
		c1.setcId(2);
		c1.setcName("spring");
		c1.setcFee(400.000);
		ArrayList<Course> b=new ArrayList<Course>();
		b.add(c1);
		b.add(c);
		
		
		Student std=new Student();
		std.setsId(101);
		std.setsName("Bhuvana");
		std.setsAge(23);
		std.setCourse(b);
		System.out.println(std);

	}

}
