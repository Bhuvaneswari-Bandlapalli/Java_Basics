package com.bank2;

public class icici implements sebi {

	@Override
	public String customer(String customerName) {
		String name=customerName;
		return name;
	}

	@Override
	public double rateOfInterest(double loan) {
		int simpleInterest=2000;
		int timeInMonths=12;
		double principal=loan;
		double rateInt=(simpleInterest*100)/(principal*timeInMonths);
		return rateInt;
		
		
	}

}
