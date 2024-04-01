package com.Loop.Or.terative.Statement;

public class Factorial {
	/*
	 * For loop:- (entry controlled loop)
	 * It executes a set of statements a fixed number of times.
	 * for(initialization;condition;updation){
	 * 		loop body statement(s).
	 * }
	 */
	public static void main(String[] args) {
		long fact=1;
		int number=5;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" is the factorial of the "+number);

	}

}
