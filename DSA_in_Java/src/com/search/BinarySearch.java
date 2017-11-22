 package com.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Dataset data = new Dataset(1000000);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to search: ");
		int Search = sc.nextInt() ;
		// <--- Binary search---->
		Boolean isFound = false;
		int low = 0;
		int high = data.getsize()-1;
		int mid =0;
		while(!isFound ){
			if(low>high){
				System.out.println("number is not found");
				break;
			}
			mid = low+((high-low)/2);
			data.NumberTry++;
			if(data.data[mid]==Search){
				System.out.println("in <--binary search--> number found after<-- " + data.NumberTry + "--> try\n");
				break;
			}
			if(data.data[mid]<Search)
				low=mid+1;
			if(data.data[mid]>Search)
				high=mid-1;
		}
		// <----Linear Search --->
		for(int i=0;i<data.getsize();i++){
			data.NumberTry++;
			if(data.data[i]==Search){
				System.out.println("in <--linear search Element--> is found after try <--" + data.NumberTry + "--> try");
				System.out.println();
				isFound = true;
				break;
			}
		}
		
		if(isFound == false ){
			System.out.println("Number is not found");
		}
	}

}
