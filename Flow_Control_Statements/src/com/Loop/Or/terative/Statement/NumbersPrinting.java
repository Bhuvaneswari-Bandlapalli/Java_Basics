package com.Loop.Or.terative.Statement;

public class NumbersPrinting {
	/*
	 * do-while loop:-(exit control loop)
	 * It always executes its body at least once before the test evaluates.
	 * 
	 * initialization
	 * do{
	 * 		body of loop
	 * 		increment/decrement
	 * }while(condition);
	 */
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		 }while(i<=10);

	}

}
