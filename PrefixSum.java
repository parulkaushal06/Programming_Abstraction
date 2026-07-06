package com.chitkara;
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,8,1,6};
		// Calculating sum with simple approach by using sum variable and then iterating over the loop and adding to the sum variable gives o(n) tc but we want 0(1) tc thats why we use prefix sum
		int [] ans = new int[arr.length];
		int st = 2;
		int end = 5;
		int sol = 0;
		ans[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			ans[i] = ans[i-1]+arr[i];	
		}
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		if(st==0) {
			sol = ans[end];
		}
		else {
			sol = ans[end]- ans[st-1];
			
		}
		System.out.println(" Sum = "+sol);
	}
	
}
