package com.decisionMaking_statement;

public class Largest{
	/*if-else-if statement:-multi-way decision structure that is used to decide among the three or more actions 
	 * if(condition){
	 * 		statements
	 * }else if(condition){
	 * 		statements
	 * }else{
	 * 		statements
	 * }
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		double num1=2.8;
		double num2=3.9;
		double num3=9.8;
		if((num1>=num2) && (num1>=num3)){
			System.out.println(num1 +" is the largest number");
		}else if((num2>=num1) && (num2>=num3)){
			System.out.println(num2+" is the largest number");
		}else {
			System.out.println(num3+" is the largest number");
		}
	}

}
