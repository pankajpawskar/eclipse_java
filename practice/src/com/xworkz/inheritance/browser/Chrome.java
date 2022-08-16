package com.xworkz.inheritance.browser;

public class Chrome extends Browser {
	public double version = 104.051127981;
	public int firstReleased = 2008;
	public String website = ("www.google.com/chrome");

	public Chrome() {
	}

	public Chrome(double version, int firstReleased, String website) {
		this.version = version;
		this.firstReleased = firstReleased;
		this.website = website;
	}

	public void torisu() {
		System.out.println("Type :" + type);
		System.out.println("Developer :" + developed);
		System.out.println("Name :" + name);
		System.out.println("Version :" + version);
		System.out.println("First Released :" + firstReleased);
		System.out.println("Website :" + website);

	}
}
