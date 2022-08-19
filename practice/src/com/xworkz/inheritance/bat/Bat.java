package com.xworkz.inheritance.bat;

public class Bat extends Wood {
	public String size = ("CRICKET");
	public double avgWeight = 1.23;
	public double avgLength = 25.2;
	public String brand = ("SG");
	public int price = 99999;

	public Bat() {
	}

	public Bat(String size, double avgWeight, double avgLength, String brand, int price) {
		this.size = size;
		this.avgWeight = avgWeight;
		this.avgLength = avgLength;
		this.brand = brand;
		this.price = price;
	}

	public void torisu() {

		System.out.println("Type :" + type); 	
		System.out.println("Name :" + name);
		System.out.println("AvgWeight :" + avgWeight);
		System.out.println("AvgLength :" + avgLength);
		System.out.println("Brand :" + brand);
		System.out.println("Price :" + price);

	}
}
