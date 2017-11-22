package com.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		QueueDArray<Integer> q = new QueueDArray<Integer>(2);
		
		q.Queueinsert(11);
		q.Queueinsert(12);
		System.out.println("SiZe: " + q.getSize());
		q.Queueinsert(12);
		System.out.println("SiZe: " + q.getSize());
		

	}

}
