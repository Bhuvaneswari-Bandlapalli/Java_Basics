package com.courseStudent;

public class Course {
	private int cId;
	private String cName;
	private double cFee;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getcFee() {
		return cFee;
	}
	public void setcFee(double cFee) {
		this.cFee = cFee;
	}
	@Override
	public String toString() {
		return "Course Id= "+cId + ", cName=" + cName + ", cFee=" + cFee ;
	}
	
	
}
