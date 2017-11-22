package com.ds;

public class StacklinkedList<T> {
	Node top;

	public StacklinkedList() {
		top = null;
	}
public void push(Object value){
	Node newNode = new Node(value,null);// add values to stack
	if(top==null) // top is empty
		top = newNode; // top gets new node or new value 
	else{
		newNode.next = top; // if the top is not empty means it has a value so  
		top = newNode;// mow the top become new node
	}
}
public  T pop(){
	if(top==null){ // if top does not have any element 
		System.out.println("Stack is Empty");
		return null;
	}
	T value = (T) top.value; // remove the top value in stack
	top = top.next; // the  top is removed 
	return value;
}

}
