package com.dsa.practise.array;

public class ArrayUtil {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int findMinium(int[] arr) {
		if(arr == null || arr.length == 0 ) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void reverseArray(int[] rev) {
		int start = 0;
		int end = rev.length - 1;
		
		while(start < end) {
			int temp = rev[start];
			rev[start] = rev[end];
			rev[end] = temp;
			
			start++;
			end--;
		}
	}
	
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i ++) {
			temp[i] = arr[i];
		}	
		return temp;
	}
	
	public void arrayDemo() {
		int[] arr = { 1, 3, 6, 8, 9, 5, 2, 4, 7, 12 };
		System.out.println(findMinium(arr));
	}
	
	public static void main(String[] args) {
		int[] originalArray = {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i: originalArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		reverseArray(originalArray);
		
		System.out.println("Reverse Array: ");
		for(int i: originalArray) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		/*
		 * ArrayUtil arrUtil = new ArrayUtil(); arrUtil.arrayDemo();
		 */
		
		/*
		 * arrUtil.printArray(new int[] {5,1,2,9,10}); int[] original = new int[]
		 * {5,1,2,9,10}; System.out.println("The size of original array - " +
		 * original.length); original = arrUtil.resize(original, 10);
		 * System.out.println("The size of original after resize - " + original.length);
		 */
	}

}
