package com.ds;

public class QueueDemo {

	public static void main(String[] args) {
		Queue s = new Queue();
		
		s.add(12);
		s.add(23);
		s.add(45);
		s.add(32);
		s.add(34);
		
		System.out.println("Peek: " + s.peek());
		s.remove();
		System.out.println("after removing from head");
		System.out.println("Peek: " + s.peek());
		s.remove();
		System.out.println("after removing from head");
		System.out.println("Peek: " + s.peek());
		s.remove();
		System.out.println("after removing from head");
		System.out.println("Peek: " + s.peek());
		

	}

}
