package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListD<String> ls = new LinkedListD<String>();
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
