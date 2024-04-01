package com.bank2;

public class hdfc implements sebi {

	@Override
	public String customer(String customerName) {
		String name=customerName;
		return name;
	}

	@Override
	public double rateOfInterest(double loan) {
		int simpleInterest=1500;
		int timeInMonths=12;
		double principal=loan;
		double rateInt=(simpleInterest*100)/(principal*timeInMonths);
		return rateInt;
		
	}

}
