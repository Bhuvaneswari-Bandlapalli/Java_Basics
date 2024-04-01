package com.stringMethods;

public class Demo {
	/*
	 * String:-reference type
	 * Sequence of charectors or bunch of charectors enclosed with double quatations
	 * String s="bhuvi";
	 */
	public static void main(String[] args) {
		String name=" Bhuvaneswari@  ";
		System.out.println(name);
		System.out.println(name.charAt(3)); //char
		System.out.println(name.length()); //int
		System.out.println(name.startsWith("b")); //boolean
		System.out.println(name.endsWith("i"));  //boolean
		System.out.println(name.contains("bhu"));  //boolean
		System.out.println(name.equals("   bhuvaneswari@  ")); //boolean
		System.out.println(name.trim());   //String
		System.out.println(name.toUpperCase());  //String
		System.out.println(name.toLowerCase());  //String
		

	}

}
