package com.dsa.practise.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
	
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i= 0; i < numbers.length; i ++) {
			if(!map.containsKey(target - numbers[i])) {
				map.put(numbers[i], i);
			}else {
				result[1] = 1;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
		}
		throw new IllegalArgumentException("Two numbers not found");
		
	}
	
	
	
	public static int[] twoSumII(int[] arr, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int[] result = new int[2];
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				result[0] = arr[left];
				result[1] = arr[right];
				return result;
			} else if(sum < target) {
				left ++;
			}else {
				right --;
			}
		}
		return new int[0];
	}
	
	public static int[] sortedSquares(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		int[] result = new int[n];
		
		for(int k = n - 1; k >= 0; k --) {
			if(Math.abs(arr[i]) > Math.abs(arr[j])) {
				result[k] = arr[j] * arr[i];
				i++;
			}else {
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}
	
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		for(int num: arr) {
			sum = sum - num;
		}
		return sum;
	}
	
	public void arrayDemo() {
		int[] arr = { 1, 3, 6, 8, 9, 5, 2, 4, 7, 12 };
		System.out.println(findMissingNumber(arr));

	}
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 6, 8, 9, 5, 2, 4, 7, 12 };
		int target = 10;
		int result[] = twoSum(arr, target);
		
		
		 if (result.length == 2) {
	            System.out.println("Pair found: " + result[0] + " + " + result[1] + " = " + target);
	        } else {
	            System.out.println("No pair found for target " + target);
	        }
		
		
		/*
		 * int[] originalArray = {1,2,3,4,5}; System.out.println("Original Array: ");
		 * for(int i: originalArray) { System.out.print(i + " "); }
		 * System.out.println(); reverseArray(originalArray);
		 * 
		 * System.out.println("Reverse Array: "); for(int i: originalArray) {
		 * System.out.print(i + " "); }
		 * 
		 * System.out.println();
		 */
		
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
