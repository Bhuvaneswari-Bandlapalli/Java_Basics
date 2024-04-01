package com.operators;

import java.util.Scanner;
public class GreaterThan70 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		System.out.println(num>70);
//		if(num<70) {
//			System.out.println(true);
//		
//		}else {
//			System.out.println(false);
//		}
	}

}
