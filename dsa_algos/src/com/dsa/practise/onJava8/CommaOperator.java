package com.dsa.practise.onJava8;

public class CommaOperator {
	
	public static void main(String[] args) {
		for(int i = 1, j = 1 + 10; i < 5; i++, j = i * 2) {
			System.out.println("i = " + i + " j " + j);
		}
	}

}
