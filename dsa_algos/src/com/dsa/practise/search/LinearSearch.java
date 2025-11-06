package com.dsa.practise.search;

public class LinearSearch {
	
	public int serach(int[] arr, int n, int x) {
		
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 1, 9, 2, 10, 15, 20 };
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.serach(arr, arr.length, 15));
	}

}
