package com.dsa.practise.digitalOcean;

public class StringPrograms {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(reverse(str));
	}

	// 123
	public static String reverse(String in) {
		if (in == null) {
			throw new IllegalArgumentException();
		}

		StringBuilder sb = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}

}
