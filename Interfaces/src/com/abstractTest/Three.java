package com.abstractTest;

public class Three extends One {
	


	@Override
	public void m1() {
		System.out.println("method m1 in slokam");
		
	}
	@Override
	void m4() {
		System.out.println("method m4 in threee");
	}


	public static void main(String[] args) {
		One o=new Three();
		System.out.println(o.k);
		o.m1();
		o.m2();
		o.m4();

	

	
	}
	
}
