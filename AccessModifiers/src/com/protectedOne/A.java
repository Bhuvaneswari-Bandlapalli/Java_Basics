package com.protectedOne;

public class A {
 protected void m1() {
	 System.out.println("call m1");
 }
 public static void main(String[] args) {
	A a=new A();
	a.m1();
}
}
