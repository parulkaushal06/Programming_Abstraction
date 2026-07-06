package com.chitkara;
public class SlidingWindow {
	public static int maxSum(int[] arr, int k) {

	    int windowSum = 0;

	    
	    for (int i = 0; i < k; i++) {
	        windowSum += arr[i];
	    }

	    int max = windowSum;

	    
	    for (int j = k; j < arr.length; j++) {
	        windowSum += arr[j];       
	        windowSum -= arr[j - k];   

	        max = Math.max(max, windowSum);
	    }

	    return max;
	}
	public static void main(String[] args) {
		
	}
}
