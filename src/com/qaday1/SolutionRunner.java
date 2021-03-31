package com.qaday1;

public class SolutionRunner {

	public static int add( int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static int sub( int num1, int num2) {
		int result = num1 - num2;
		return result;
	
	}
	
	public static double multiply( double n1 , double n2) {
		double result =  n1*n2;
		return result;
		
		}
		
	
	
	public static double div( double n1 , double n2) {
		if (n1>n2) {
		double result = n1/n2;
		return result;
		}
		else {
			System.out.println("Division cannot be performed ");
		}
		return 0;
	}
	
}
