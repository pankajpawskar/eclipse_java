package com.xworkz.cricket.inheritance.sub;

import com.xworkz.cricket.inheritance.base.Cricket;

public class OndayCricket extends Cricket {
	public String bestBowler;
	public String bestBatsman;

	public void setBestBowler(String bestBowler) {
		this.bestBowler = bestBowler;
	}

	public void setBestBatsman(String bestBatsman) {
		this.bestBatsman = bestBatsman;
	}

	public String manOfSeries(String matchType) {
		if (matchType == "test match") {
			return "V Sehwag";
		}
		if (matchType == "one day") {
			return "Y Singh";
		}
		if (matchType == "T20") {
			return "G Belly";
		}
		return null;
	}

	@Override
	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of sub class one day cricket.");
		boolean ref = super.entertainment(matchType);
		if(ref == false) {
			if(matchType == "IPL") {
				return true;
			}
		}
		return ref;
	}

	@Override
	public double presentation(String matchType) {
		System.out.println("presentation method of sub class one day cricket.");
		double var = super.presentation(matchType);
		if(var == 0.0) {
			if(matchType == "IPL") {
				return 1.25;
			}
		}
		return var;
	}

	@Override
	public void printData() {
		super.printData();
		System.out.println(this.bestBowler);
		System.out.println(this.bestBatsman);

	}
	
	
	
	
	

}


