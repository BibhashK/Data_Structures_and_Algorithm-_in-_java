package com.ds;

public class StackArray<T> {
Object[] ArrayStack;
int size;
int top;
			// constructor
	public StackArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];// size of array
		top = -1; // since top is empty now
	}
	
	// push operation [adding a new item]
	public void push(Object newItem){
		 if(isFull()){
			 System.out.println("Stack is Full");
			 return;
		 }
		 top = top +1;
		 ArrayStack[top] = newItem;
	}
	public Boolean isFull(){
		return(top==size-1);
	}
	public T  pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		T item = (T) ArrayStack[top];
		top = top-1;
		return item;
	}
	public Boolean isEmpty(){
		return(top== -1);
	}

}
