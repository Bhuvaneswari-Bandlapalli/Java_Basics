package com.demoArray;

public class StringMethods {

	public static void main(String[] args) {
		String names[]= {"bhuvi","cherry","bhuvana","rukku","kutty"};
		for(int i=0;i<=names.length-1;i=i+1) {
			String s=names[i];
			if(s.startsWith("b")) {
				System.out.println("starts with b: "+s);
			}
			if(s.endsWith("y")) {
				System.out.println("ends with y: "+s);
			}
		}

	}


}
