package com.Sort;

public class BubbleSorting {
	
	static void BubbleSort(int[] arr){
		int n = arr.length;
		int temp = 0;
		for(int i =0; i<n;i++) // for moving forward
			for(int j=1;j<(n-i);j++){ //for moving backward
				
				if(arr[j-1] > arr[j]){
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]	= temp;
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,50,30,20,60,80};
		System.out.println("before sort:");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] +"\t");
		BubbleSort(arr);
		System.out.println("\nAfter sort:");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] +"\t");
	}

}
