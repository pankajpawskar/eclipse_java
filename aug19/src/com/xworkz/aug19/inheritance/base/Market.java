package com.xworkz.aug19.inheritance.base;

public class  Market {
	public String typeOfMarket;
	public double openTime;
	public double closeTime;
	
	public Market(String typeOfMarket,double openTime,double closeTime) {

		this.typeOfMarket = typeOfMarket;
		this.openTime = openTime;
		this.closeTime = closeTime;
		System.out.println("const base class.");
	}
	public void display() {
		
		System.out.println(this.typeOfMarket);
		System.out.println(this.openTime);
		System.out.println(this.closeTime);

	}

}