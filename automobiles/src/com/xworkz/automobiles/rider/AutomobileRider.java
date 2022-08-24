package com.xworkz.automobiles.rider;

import com.xworkz.automobiles.inheritance.base.Automobile;

import com.xworkz.automobiles.inheritance.sub.HondaAutomoblile;

import com.xworkz.automobiles.inheritance.sub.TataAutomobile;

public class AutomobileRider {

	public static void main(String[] args) {

		Automobile automobile = new Automobile();
		automobile.setBrand("Marti Suzuki");
		double khg = automobile.sellAccesories("Chains packet");
		System.out.println(khg);
		System.out.println("<----------------------------->");

		HondaAutomoblile honda = new HondaAutomoblile("2 Wheeler", "actica");
		honda.setOpentime();
		honda.setClosetime();
		honda.torisu();
		System.out.println("<----------------------------->");

		TataAutomobile tata = new TataAutomobile("4 Wheeler", "SAFARI");
		tata.torisu();

	}

}
