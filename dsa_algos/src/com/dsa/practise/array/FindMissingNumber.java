package com.dsa.practise.array;

public class FindMissingNumber {
	
	
	public static int findMissingNumbers(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n+ 1) / 2;
		for(int num : arr) {
			sum = sum - num;
		}
		return sum;
	}
	
	
	public void arrayDemo() {
		int[] arr = {1,3,6,8,2,4,7};
		System.out.println(findMissingNumbers(arr));
	}
	
	public static void main(String[] args) {
		FindMissingNumber arrUtil = new FindMissingNumber();
		arrUtil.arrayDemo();
	}

}
