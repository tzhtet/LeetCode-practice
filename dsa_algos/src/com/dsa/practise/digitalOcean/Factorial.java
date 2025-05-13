package com.dsa.practise.digitalOcean;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Factorial of 1: " + factorial(1));  
		System.out.println("Factorial of 5: " + factorial(5)); 
		System.out.println("Factorial of 10: " + factorial(10)); 
	}
	
	public static long factorial(long number) {
		if (number == 1) {
			return 1;
		} else {
			return (number * factorial(number - 1));
		}
	}
}
