package com.xworkz.inheritance.cycle;

public class Bike extends Cycle {
	public int wheels = 2;
	public String fuel = ("petrol");
	public String engine = ("present");
	public int breaks = 2;
	public int price = 300000;

	public Bike() {
	}

	public Bike(int wheels, String fuel, String engine, int breaks, int price) {
		this.wheels = wheels;
		this.fuel = fuel;
		this.engine = engine;
		this.breaks = breaks;
		this.price = price;
	}

	public void torisu() {

		System.out.println("wheels :" + wheels);
		System.out.println("fuel :" + fuel);
		System.out.println("engine :" + engine);
		System.out.println("breaks :" + breaks);
		System.out.println("Price :" + price);

	}
}
