package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
			
		LinkedListU<String> ls = new LinkedListU<String>();
		ls.add("ram");
		ls.add("raj");
		ls.add("amam");
		ls.add("rosham");
		System.out.println("before delete:");
		ls.display();
		ls.delete();
		System.out.println("after delete:");
		ls.display();
		
	}

}
