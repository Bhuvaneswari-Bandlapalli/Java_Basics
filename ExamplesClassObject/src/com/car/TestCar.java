package com.car;

public class TestCar {

	public static void main(String[] args) {
		Car c=new Car();
		c.engine=1200;
		c.color="sky-blue";
		c.fuelType="Petrol";
		c.tyres="mrf";
		c.windows="Power windows";
		
		System.out.println("Engine capacity: "+c.engine);
		System.out.println("car color: "+c.color);
		System.out.println("Fuel Type of car: "+c.fuelType);
		System.out.println("Type of tyres: "+c.tyres);
		System.out.println("Type of windows: "+c.windows);
		
		System.out.println("=================");
		Car c1=new Car();//creating another object
		c1.engine=1400;
		c1.color="Black";
		c1.fuelType="CNG";
		c1.tyres="mrf";
		c1.windows="Opera window";
		
		System.out.println("Engine capacity(in cc): "+c1.engine);
		System.out.println("car color: "+c1.color);
		System.out.println("Fuel Type of car: "+c1.fuelType);
		System.out.println("Type of tyres: "+c1.tyres);
		System.out.println("Type of windows: "+c1.windows);
		}

}
