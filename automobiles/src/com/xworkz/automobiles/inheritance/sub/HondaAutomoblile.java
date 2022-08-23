package com.xworkz.automobiles.inheritance.sub;

import com.xworkz.automobiles.inheritance.base.Automobile;

public class HondaAutomoblile extends Automobile {
	public double openTime;
	public double closeTime;

	public void setOpentime() {
		this.openTime = 9.30;
	}

	public void setClosetime() {
		this.closeTime = 6.30;
	}

	public HondaAutomoblile(String type, String brand) {
		
		super.type = type;
		super.brand = brand;
	}

	@Override
	public void torisu() {
		System.out.println(super.type);
		System.out.println(super.brand);
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}

}
