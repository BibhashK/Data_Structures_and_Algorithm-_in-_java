package com.ds;

public class Node {
Object value;
Node next;
	public Node(Object value, Node next) {
		this.value = value;
		this.next = next;
		//  _________
		//	|v   |p   |	 v = value 
		//	|v___|p___|	 p = pointer		
	}

}
