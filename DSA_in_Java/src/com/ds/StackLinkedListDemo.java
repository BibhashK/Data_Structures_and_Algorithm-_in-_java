package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacklinkedList<String> st = new StacklinkedList<String>();
		st.pop();
		st.push("Kalita");
		st.push("janhua");
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
