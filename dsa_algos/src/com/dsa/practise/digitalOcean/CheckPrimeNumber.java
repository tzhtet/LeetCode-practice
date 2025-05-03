package com.dsa.practise.digitalOcean;

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPrime(19));
		System.out.println(isPrime(49));
	}
	
	
	public static boolean isPrime(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		if(number == 2) {
			return true;
		}	
		
		for(int i = 2; i <=number / 2; i ++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
