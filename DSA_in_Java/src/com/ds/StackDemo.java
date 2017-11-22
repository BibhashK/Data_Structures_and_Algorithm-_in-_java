package com.ds;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(13);
		s.push(56);
		s.push(45);
		s.push(89);
		
			
		
		System.out.println("peek: " + s.peek());	
		
		s.pop();
		System.out.println("peek: " + s.peek());	
		
		s.pop();
		System.out.println("peek: " + s.peek());	
		}
		

	}


