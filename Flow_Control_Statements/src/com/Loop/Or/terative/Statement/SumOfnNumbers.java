package com.Loop.Or.terative.Statement;

public class SumOfnNumbers {
	/*
	 * While loop:(entry controlled loop)
	 * This loop considered as a repeating if statement .
	 * If the no.of iterations is not fixed.
	 * 
	 * initialization
	 * while(condition){
	 * 		loop body
	 * 		increment/decrement
	 * }
	 * 
	 * 		
	 */
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		int number=10;
		while(i<=number) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println("sum of "+number+"'s numbers: "+sum );

	}

}
