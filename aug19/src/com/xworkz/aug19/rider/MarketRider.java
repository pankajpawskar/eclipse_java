package com.xworkz.aug19.rider;

import com.xworkz.aug19.inheritance.base.Market;

import com.xworkz.aug19.inheritance.sub.SuperMarket;

import com.xworkz.aug19.inheritance.subOfsub.OnlineSuperMarket;

public class MarketRider {

	public static void main(String[] args) {

		Market market1 = new Market("SuperMarket", 6.30, 20.30);
		market1.display();
		
		
		Market market2= new SuperMarket("SuperMarket", 6.30, 20.30,"D-MART","Vijaynagr",200);
		market2.display();
		SuperMarket superMarket= new SuperMarket("SuperMarket1", 7.30, 21.30,"MORE","BTM",50);
		superMarket.display();
		
		Market market3=new OnlineSuperMarket ("SuperMarket", 6.30, 20.30,"relince","jp nagr",300,"relince.com","avilable",4.5);
		market3.display();
		SuperMarket superMarket2= new OnlineSuperMarket("SuperMarket2", 8.30, 22.30,"Dec","RR nagr",150,"dec.com","avilable",4.5);
		superMarket2.display();
		
		System.out.println("..........................");
		
		
		if (market2 instanceof SuperMarket) {
			SuperMarket convo = (SuperMarket)market2;
			convo.typeOfMarket = "SUPERMARKET";
			convo.display();
		}
		else {
			System.out.println("Not ref of supermarket");
		}
		
		System.out.println("...........................");
 if (superMarket2 instanceof OnlineSuperMarket ) {
	 
	 OnlineSuperMarket convo=(OnlineSuperMarket)market3;
	 convo.location="Jay nagr";
	 convo.display();
	 }
 else {
		System.out.println("Not ref of OnlineSuperMarket");
	}
 
if (market3 instanceof OnlineSuperMarket ) {
	 
	 OnlineSuperMarket convo=(OnlineSuperMarket)market3;
	 convo.ratings=3.2;
	 convo.display();
	 }
 else {
		System.out.println("Not ref of OnlineSuperMarket");
	}
 
 
	}
	
}
		
		

/*(String typeOfMarket,double openTime,double closeTime,String superMarketName,
	String location,int noOfStaff,String website,String cashOndelivery,double ratings) */