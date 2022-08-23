package com.xworkz.automobiles.inheritance.base;

public class Automobile {
	public String type;
	public String brand;

	public void setType() {
		this.type = "2 Wheeler";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double sellAccesories(String name) {
		if (name == "Tyres") {
			System.out.print(" Cost is : ");
			return 5000;
		}
		if (name == "Chain packet") {
			System.out.print(" Cost is : ");
			return 1200;
		}
		if (name == "Clutch plate") {
			System.out.println(" Cost is : ");
			return 3600;
		}
		if (name == "Mirrors") {
			System.out.println(" Cost is : ");
			return 250;
		}
		if (name == "Clutch Cable") {
			System.out.println(" Cost is : ");
			return 600;
		}
		if (name == "Brake wire") {
			System.out.println(" Cost is : ");
			return 900;
		} else {
			System.out.println("  Accessories name ");
			return 0;
		}
	}
	protected void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.brand);
		
	}	
}
