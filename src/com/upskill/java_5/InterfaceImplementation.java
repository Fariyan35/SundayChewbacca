package com.upskill.java_5;

public class InterfaceImplementation implements Interface{
	public static void mai(String[]args){
	}

	@Override
	public void iDoor() {
		System.out.println("4 Door");
		
	}

	@Override
	public int iWheel() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String iEngine() {
		// TODO Auto-generated method stub
		return "2 litr";
	}

	@Override
	public void iSeat() {
		System.out.println("4 seat");
		
	}
}