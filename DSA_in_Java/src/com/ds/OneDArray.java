package com.ds;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[5];
		
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 6;
		numbers[4] = 11;
		
		for(int i =0; i < numbers.length;i++){
			System.out.println(numbers[i]);
		}
	// array of objects
		
		Students[] students = new Students[4];
		students[0] = new Students("haran" , 27);
		students[1] = new Students("ham" , 23);
		students[2] = new Students("aran" , 20);
		students[3] = new Students("ryan" , 21);
		
		for(Students student: students){
			
			System.out.println("name: " + student.name+"\t" + "age: " + student.age);
		}
		
	}

}
