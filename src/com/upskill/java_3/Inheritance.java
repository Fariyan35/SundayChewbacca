package com.upskill.java_3;

import com.upskill.java_2.MethodType;

public class Inheritance extends MethodType{
	
	/* The process of obtaining the data member and methods from one class to another class is known as inheritance
- Single inheritance (Parent - Child)
-Multiple inheritance (Parent+Parent - Child) Java does not support it directly rather through Interfaces)
- Multilevel Inheritance (Grand Parent + Parent + Child) */
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.annualIncomevoid();
		obj.weeklyIncomeStatic();

	}

}
