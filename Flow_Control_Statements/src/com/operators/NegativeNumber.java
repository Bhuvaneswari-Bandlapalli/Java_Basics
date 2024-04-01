package com.operators;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		boolean negative=num<0;
		System.out.println(negative);
	}

}
