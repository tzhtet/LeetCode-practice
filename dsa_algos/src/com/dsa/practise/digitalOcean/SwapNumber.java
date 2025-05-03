package com.dsa.practise.digitalOcean;

public class SwapNumber {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a is " + a + " and b is "+ b);
		
		a = a + b; //a = 30
		b = a - b; //b = 10
		a = a - b; //a = 20
		
		System.out.println("After swapping, a is " + a + " and b is "+ b);
	}

}
