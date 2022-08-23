package com.xworkz.automobiles.rider;

import com.xworkz.automobiles.inheritance.base.Automobile;

import com.xworkz.automobiles.inheritance.sub.HondaAutomoblile;

import com.xworkz.automobiles.inheritance.sub.TataAutomobile;

public class AutomobileRider {

	public static void main(String[] args) {

		Automobile autom = new Automobile();
		autom.setBrand("Marti Suzuki");
		double khg = autom.sellAccesories("Chains packet");
		System.out.println(khg);
		System.out.println("<----------------------------->");

		HondaAutomoblile honda = new HondaAutomoblile("2 Wheeler", "Pulser");
		honda.setOpentime();
		honda.setClosetime();
		honda.torisu();
		System.out.println("<----------------------------->");

		TataAutomobile tata = new TataAutomobile("4 Wheeler", "kIA");
		tata.torisu();

	}

}
