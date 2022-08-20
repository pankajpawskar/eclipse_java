package com.xworkz.aug19.inheritance.subOfsub;

import com.xworkz.aug19.inheritance.sub.SuperMarket;

public class OnlineSuperMarket extends SuperMarket{

	public String website;
	public String cashOndelivery;
	public double ratings;
	public OnlineSuperMarket(String typeOfMarket,double openTime,double closeTime,String superMarketName,String location,int noOfStaff,String website,String cashOndelivery,double ratings) {
		
		super(typeOfMarket,openTime,closeTime,superMarketName,location,noOfStaff);
		this.website = website;
		this.cashOndelivery = cashOndelivery;
		this.ratings = ratings;
		System.out.println("const sub of sub class");
	}

	public void display1() {
		
		System.out.println(super.typeOfMarket);
		System.out.println(super.openTime);
		System.out.println(super.closeTime);
		System.out.println(super.superMarketName);
		System.out.println(super.location);
		System.out.println(super.noOfStaff);
		System.out.println(this.website);
		System.out.println(this.cashOndelivery);
		System.out.println(this.ratings);
	}
}