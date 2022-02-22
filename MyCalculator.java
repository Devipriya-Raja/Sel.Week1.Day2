package week1.day2.assignment;

import week1.day2.assignments.Calculator;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		   int addition = calc.add(8, 8, 8);
	       System.out.println("The addition is "+addition);
	       
	       int subtract = calc.sub(8, 8);
	       System.out.println("The addition is "+subtract);
	       
	       double multiply = calc.mul(8.8971826829, 6.9171826192);
	       System.out.println("The addition is "+multiply);
	       
	       float division = calc.divide(2.50f, 5.00f);
	       System.out.println("The addition is "+division);
	       
		}
	

	}


