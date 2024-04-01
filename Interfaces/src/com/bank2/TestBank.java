package com.bank2;

public class TestBank {

	public static void main(String[] args) {
		sebi s;
		s=new hdfc();
		System.out.println("--------hdfc--------");
		String cusName=s.customer("chandana");
		System.out.println(cusName);
		double rateInt=s.rateOfInterest(10000);
		System.out.println(rateInt);
		
		System.out.println("-----icici-------------");
		s=new icici();
		
		String cusName1=s.customer("chandana");
		System.out.println(cusName1);
		double rateInterest=s.rateOfInterest(10000);
		System.out.println(rateInterest);
		
	}

}
