package com.search;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dataset data = new Dataset(100000);
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter element to search: ");
		int Search = sc.nextInt() ;
		
		Boolean isFound = false;
		for(int i=0;i<data.getsize();i++){
			data.NumberTry++;
			if(data.data[i]==Search){
				System.out.println(" in linear search Element is found after try " + data.NumberTry + " try");
				
				isFound = true;
				break;
			}
		}
		
		if(isFound == false ){
			System.out.println("Number is not found");
		}
	}

}
