package com.operators;
import java.util.*;
public class GreatestAmongTwoNumbers {

	public static void main(String[] args) {
		//first number greater than second numbers
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1=scanner.nextInt();
		System.out.println("enter the second number:");
		int num2=scanner.nextInt();
		boolean greater=num1>num2;
		System.out.println(greater);

	}

}
