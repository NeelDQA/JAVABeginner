package com.qaday1;

public class UniqueSum {
	
	public static int input (int a, int b, int c) {
		
		if (a==b & b!=c) {
			int sum = c;
			return sum;
			}
		else if (b==c & c!=a) {
			int sum = a;
			return sum;
			}
		else if(a==c & b!=a) {
			int sum = b;
			return sum;
		}
		else if(a==b & b==c) {
	
			int sum = 0;
			return sum;
		}
		else {
			int sum = a + b + c;
			return sum;
		}
	}
}
		
