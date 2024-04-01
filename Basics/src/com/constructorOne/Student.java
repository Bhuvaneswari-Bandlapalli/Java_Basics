package com.constructorOne;



public class Student {
	private int sId;
	private String sName;
	private int sAge;
	private Course course;
	public Student(int sId, String sName, int sAge, Course course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.course = course;
		
	}
@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", course=" + course + "]";
	}


	
}
