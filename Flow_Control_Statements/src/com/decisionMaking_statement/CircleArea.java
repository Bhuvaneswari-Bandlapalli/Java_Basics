package com.decisionMaking_statement;

public class CircleArea {
	//simple if statement =>it evaluates boolean expression and enables the program to enter a block if the expression evaluate true. 
	/*
	 * if(condition){
	 *  statements 
	 * }
	 * 
	 */
	public static void main(String[] args) {
		int radius=10;
		double pi=3.14;
		double area;
		if(radius>0) {
			area=radius*radius*pi;
			System.out.println("area of circle"+area);
		}

	}

}
