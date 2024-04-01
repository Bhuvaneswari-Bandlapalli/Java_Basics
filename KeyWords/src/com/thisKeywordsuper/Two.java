package com.thisKeywordsuper;

public class Two extends One {
	int i=40;
	public void m2() {
		System.out.println("call m2  "+this.i);
		System.out.println("call m2 "+super.i);
		int k=super.i;
	}
	public static void main(String[] args) {
		Two t=new Two();
		t.m1();
		t.m2();
		

	}

}
//this always refers current class and  parent class also
//super always refers parent class
