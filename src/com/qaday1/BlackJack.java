package com.qaday1;

public class BlackJack {
	public static void play (int a, int b) {
		
		if (a<=21 & b <=21 & a>b) {
			System.out.println(a);
			}
		else if (a<=21 & b<=21 & b>a) {
			System.out.println(b);
		}
		else if (a<=21 & b>21) {
			System.out.println(a);
		}
		else if (a>21 & b<=21) {
			System.out.println(b);
		}
		else {
			System.out.println("0");
		}
		
	}

}

