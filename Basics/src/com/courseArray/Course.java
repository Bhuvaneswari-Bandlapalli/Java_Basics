package com.courseArray;

public class Course {
	private int cId;
	private String cName;
	private double cFee;
	
	public Course(int cId, String cName, double cFee) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cFee = cFee;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cFee=" + cFee + "]";
	}
	
}
