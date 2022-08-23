package com.xworkz.automobiles.inheritance.sub;

import com.xworkz.automobiles.inheritance.base.Automobile;

public class TataAutomobile extends Automobile {

	public TataAutomobile(String type, String brand) {
		this.type = type;
		this.brand = brand;
	}

	@Override
	public void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);

	}

}
