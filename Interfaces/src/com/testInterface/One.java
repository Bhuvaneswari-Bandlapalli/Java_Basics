package com.testInterface;

public class One extends Two implements A,B {
	@Override
	public void m3() {
		System.out.println("method m3");
		
	}

	@Override
	public void m1() {
		System.out.println("method m1");
		
	}

	@Override
	public void m2() {
		System.out.println("method m2");
		
	}
	public static void main(String[] args) {
		One o=new One();
		o.m1();
		o.m2();
		o.m3();
		System.out.println("-----------");
		A a=new One();
		a.m1();
		a.m2();
		System.out.println("------------");
		B b=new One();
		b.m1();
		b.m3();
		System.out.println("---------");
		System.out.println(A.i);
		System.out.println(B.i);
		
	}

	

}
