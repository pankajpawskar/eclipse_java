package com.xworkz.cricket.inheritance.sub;

import com.xworkz.cricket.inheritance.base.Cricket;

public class T20Cricket extends Cricket {

	public String manOfMatch(String matchType) {
		if (matchType == "test match") {
			return "MS Dhoni";
		}
		if (matchType == "one day") {
			return "Virat Kohli";
		}
		if (matchType == "T20") {
			return "Tendulkar";
		}
		return null;
	}

	@Override
	public boolean entertainment(String matchType) {
		System.out.println("Entertainment method of sub class T20 cricket");
		boolean ref = super.entertainment(matchType);
		if (ref == false) {
			if (matchType == "IPL") {
				return true;
			}
		}
		return ref;
	}
}