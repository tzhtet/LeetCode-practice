package com.dsa.practise.mathematics;

public class RemoveInteger {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i ++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
	}
}
