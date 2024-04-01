package com.protectedOne;

public class B extends A {
	
	public static void main(String[] args) {
		A b=new A();
		A a=new B();
		B b1=new B();
		b.m1();
		a.m1();
		b1.m1();
	}

}
