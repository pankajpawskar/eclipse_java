package com.xworkz.inheritance.glass;

public class Glass {
	
	public String mirrorFrameColor = "black";
	public String mirrorFrameMaterial = "Wood";
	public int lengthInInche = 10;
	public int breadthInInche = 4;
	public int price = 100;

	public Glass() {
		System.out.println("mirror is a glass");
	}

	public void torisu() {
		System.out.println(this.mirrorFrameColor);
		System.out.println(this.mirrorFrameMaterial);
		System.out.println(this.lengthInInche);
		System.out.println(this.breadthInInche);
		System.out.println(this.price);
	}

}
