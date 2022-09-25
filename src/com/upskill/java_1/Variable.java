package com.upskill.java_1;

public class Variable {

	// variables in java
	
	public String country = "USA"; //Instance or global variable - Variables declared in class level, outside method
	
	public static String region = "America"; //Static variable - variables belong to class and don't required creating object
	
	public static void main(String[] args) {

    String city = "NYC"; //Local variable - variables declared in methods
	}

	public void myMethod(String country){ //Method parameter - variables used as method parameter
		
		String myCountry = country;
}
}
