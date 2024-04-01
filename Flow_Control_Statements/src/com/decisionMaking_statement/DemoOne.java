package com.decisionMaking_statement;

public class DemoOne {
	//nested if statement:-the if statement can contain a if or if-else statement inside another if or else-if statement.
	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		if(a) {
			System.out.println("hiii 1");
			if(b) {
				System.out.println("hiii 2");
			}else {
				System.out.println("hello 1");
			}
		}else {
			System.out.println("hello 2");
		}

	}

}
