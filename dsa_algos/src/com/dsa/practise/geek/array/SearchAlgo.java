package com.dsa.practise.geek.array;

import java.util.Arrays;
import java.util.List;

public class SearchAlgo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 6, 8, 10);
		int key = 6;

		System.out.println("Linear Search: " + list.contains(key));

		int index = binarySearch(list, key);
		if (index >= 0) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}

	}

	public static int binarySearch(List<Integer> list, int target) {
		int left = 0;
		int right = list.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			int midValue = list.get(mid);

			if (midValue == target) {
				return mid;
			}

			if (midValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
