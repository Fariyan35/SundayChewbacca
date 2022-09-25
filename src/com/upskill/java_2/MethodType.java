package com.upskill.java_2;

public class MethodType {
	
	/* Types of Methods
	 
	 *1. Void Method
	 *2. Static Method
	 *3. Return Type Method */
	
	 public static int hourlyIncome  = 65;
	 
	 public static void main(String[] args) {
			MethodType obj = new MethodType();
			obj.annualIncomevoid();
			weeklyIncomeStatic();
			System.out.println("My Monthly Income = " +obj.monthlyIncomeReturn());
	 }
	 
	//void method
	 public void annualIncomevoid(){
	 int annualIncome = hourlyIncome * 2000;
	 System.out.println("My Annual Income = "+ annualIncome);
     }
	 
     //static method
     public static void weeklyIncomeStatic(){
     int weeklyncome = hourlyIncome * 40;
     System.out.println("My Weekly Income = " + weeklyncome);
     }
     //Return Type Method
     public int monthlyIncomeReturn(){
    	 int monthlyIncome = hourlyIncome * 180;
    	 return monthlyIncome;
     }
}