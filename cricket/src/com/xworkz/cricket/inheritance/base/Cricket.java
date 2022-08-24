package com.xworkz.cricket.inheritance.base;

public class Cricket {

	public String country;
	public String captain;
	public int jerseyNumber;

	public void setCountry(String country) {

		this.country = country;
	}

	public void setCaptain(String captain) {

		this.captain = captain;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of base class");
		if (matchType == "test match") {
			return true;
		}
		if (matchType == "one day") {
			return true;
		}
		if (matchType == "T20") {
			return true;
		}
		return false;

	}

	public double presentation(String matchType) {

		System.out.println("presentation is method of sub class");
		if (matchType == "test match") {
			return 3.0;
		}
		if (matchType == "one day") {
			return 2.5;
		}
		if (matchType == "T20") {
			return 1.0;

		}
		return 0.0;
	}

	public void printData() {

		System.out.println(this.country);
		System.out.println(this.captain);
		System.out.println(this.jerseyNumber);
	}

}
