package com.ds;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<String> q =new QueueLinkedList<String>(0);
		q.Queue("jenm");
		q.Queue("layla");
		q.Queue("akira");
		System.out.println("size: " + q.getsize());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
	}

}
