package com.xworkz.cricket.rider;

import com.xworkz.cricket.inheritance.base.Cricket;

import com.xworkz.cricket.inheritance.sub.*;

public class CricketRider {

	public static void main(String[] args) {

		Cricket cricket = new Cricket();
		cricket.setCountry("India");
		cricket.setCaptain("Virat Kohli");
		cricket.setJerseyNumber(33);
		cricket.printData();
		boolean ref = cricket.entertainment("test match");
		System.out.println(ref);
		double val = cricket.presentation("IPL");
		System.out.println(val);

		System.out.println("****************");

		TestCricket cricket2 = new TestCricket();
		cricket2.setCountry("Australia");
		cricket2.setCaptain("pat cummins");
		cricket2.setJerseyNumber(29);
		cricket2.printData();
		val = cricket2.presentation("IPL");
		System.out.println(val);

		System.out.println("******************");

		Cricket cricket1 = new TestCricket();
		cricket1.setCountry("India");
		cricket1.setCaptain("Virat Kohli");
		cricket1.setJerseyNumber(33);
		if (cricket1 instanceof TestCricket) {
			TestCricket convo = (TestCricket) cricket1;
			convo.setGroundType("green pitch");
			convo.printData();
		}
		cricket1.printData();
		ref = cricket1.entertainment("test match");
		System.out.println(ref);
		val = cricket1.presentation("");
		System.out.println(val);

		System.out.println("*******************");

		Cricket cricket3 = new OndayCricket();
		cricket3.setCountry("India");
		cricket3.setCaptain("Virat Kohli");
		cricket3.setJerseyNumber(33);
		cricket3.printData();
		boolean var = cricket3.entertainment("IPL");
		System.out.println(var);
		double val1 = cricket3.presentation("");
		System.out.println(val1);
		if (cricket3 instanceof OndayCricket) {
			OndayCricket convo = (OndayCricket) cricket3;
			String strrrr = convo.manOfSeries("IPL");
			System.out.println(strrrr);
		}

		System.out.println("*********************");

		OndayCricket cricket4 = new OndayCricket();
		cricket4.setCountry("India");
		cricket4.setCaptain("Virat Kohli");
		cricket4.setJerseyNumber(33);
		cricket4.setBestBowler("Trent Boult");
		cricket4.setBestBatsman("Babar Azam");
		cricket4.printData();
		String str = cricket4.manOfSeries("T20");
		System.out.println(str);
		boolean var1 = cricket3.entertainment("IPL");
		System.out.println(var1);
		double val2 = cricket3.presentation("");
		System.out.println(val2);

		System.out.println("*********************");

		Cricket cricket5 = new T20Cricket();
		cricket5.setCountry("India");
		cricket5.setCaptain("Virat Kohli");
		cricket5.setJerseyNumber(33);
		cricket.printData();
		boolean bool = cricket5.entertainment("test match");
		System.out.println(bool);
		if (cricket5 instanceof T20Cricket) {
			T20Cricket convo = (T20Cricket) cricket5;
			String varr = convo.manOfMatch("IPL");
			System.out.println(varr);
		}

		System.out.println("*********************");

		T20Cricket cricket6 = new T20Cricket();
		cricket6.setCountry("India");
		cricket6.setCaptain("Virat Kohli");
		cricket6.setJerseyNumber(33);
		cricket6.printData();
		boolean bool1 = cricket5.entertainment("test match");
		System.out.println(bool1);
		String strr = cricket6.manOfMatch("test match");
		System.out.println(strr);
		boolean booll = cricket6.entertainment("IPL");
		System.out.println(booll);

	}

}