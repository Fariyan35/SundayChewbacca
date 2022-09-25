package com.upskill.assignment_1;
public class Assignment1_4 {
	
//A function returns 30, another function returns 50. Write a java program which will display subtraction value from bigger number to smaller.

  public static int Function1(){
	return 30;}
	
  public static int Function2(){
	return 50;}
		
public static void main(String[]args){
	 int a = Function1();
	 int b = Function2();
	 int c = (b-a);
	 System.out.println("Result="+c);
}
}
