package com.dsa.practise.digitalOcean;

public class RemoveWihteSpaces {
	
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("There are many People in Urban Area."));
	}
	
	public static String removeWhiteSpaces(String input) {
		StringBuilder sb = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
