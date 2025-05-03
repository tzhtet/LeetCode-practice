package com.dsa.practise.digitalOcean;

public class StringContainsVowels {
	
	public static void main(String[] args) {
		System.out.println(isContainsVowels("Hello"));
		System.out.println(isContainsVowels("TV"));
	}

	public static boolean isContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
