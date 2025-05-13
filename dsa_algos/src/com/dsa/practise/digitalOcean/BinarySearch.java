package com.dsa.practise.digitalOcean;

public class BinarySearch {
	
	 public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7, 9, 11};

	        // Test Case 1: Key is present
	        int result1 = BinarySearch.binarySearch(arr, 0, arr.length - 1, 5);
	        System.out.println("Index of 5: " + result1);  // Expected: 2

	        // Test Case 2: Key is not present
	        int result2 = BinarySearch.binarySearch(arr, 0, arr.length - 1, 6);
	        System.out.println("Index of 6: " + result2);  // Expected: -1

	        // Test Case 3: Key is first element
	        int result3 = BinarySearch.binarySearch(arr, 0, arr.length - 1, 1);
	        System.out.println("Index of 1: " + result3);  // Expected: 0

	        // Test Case 4: Key is last element
	        int result4 = BinarySearch.binarySearch(arr, 0, arr.length - 1, 11);
	        System.out.println("Index of 11: " + result4);  // Expected: 5
	    }

	public static int binarySearch(int arr[], int low, int high, int key) {
	    int mid = (low + high) / 2;

	    while (low <= high) {
	        if (arr[mid] < key) {
	            low = mid + 1;
	        } else if (arr[mid] == key) {
	            return mid;
	        } else {
	            high = mid - 1;
	        }
	        mid = (low + high) / 2;
	    }

	    return -1;
	}


}
