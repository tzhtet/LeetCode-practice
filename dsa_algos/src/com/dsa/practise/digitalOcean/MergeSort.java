package com.dsa.practise.digitalOcean;
 
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		
	}
	
	public static int[] mergeSort(int[] arr,int lo, int hi) {
		if(lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			
			return br;
		}
		int mid = (lo + hi) / 2;
		
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);
		return sh;
	}

}
