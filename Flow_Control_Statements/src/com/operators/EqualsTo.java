package com.operators;

import java.util.Scanner;

public class EqualsTo {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sr.next();
		boolean h=str.equals("hello");
		System.out.println(h);

	}

}
