package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheel");
		return 4;
		
	}

	@Override
	public void iSeat() {
		System.out.println("My car has 4 seat");
		
	}

	@Override
	public String iColor() {
		System.out.println("My car is RED");
		return "RED";
	}

}
