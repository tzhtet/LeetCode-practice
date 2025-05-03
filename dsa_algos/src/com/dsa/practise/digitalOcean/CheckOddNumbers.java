package com.dsa.practise.digitalOcean;

import java.util.Arrays;
import java.util.List;

public class CheckOddNumbers {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(onlyOddNumbers(arr));
				
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(onlyOddNumbers(list));
	}
	
	
	public static boolean onlyOddNumbers(int[] arr) {
		return Arrays.stream(arr).allMatch(n -> n %2 !=0);
	}
	
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		return list.stream().allMatch(n -> n % 2 != 0);
	}

}
