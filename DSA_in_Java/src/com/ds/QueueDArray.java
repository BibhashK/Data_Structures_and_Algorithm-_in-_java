package com.ds;

import java.util.Arrays;

public class QueueDArray<T> {
Object[] Queue;
int Rear;
int Front;
int size;
	public QueueDArray(int size) {
		this.size= size;
		Queue = new Object[this.size];
		Rear = -1;
		Front = -1;
	}
	public Boolean isFull(){
		return(Rear == size-1);
	}
	public void Queueinsert(Object newItem){
		ensureCapacity(Rear+2);
		Rear = Rear + 1;
		Queue[Rear] = newItem;
		if(Front == -1)
			Front = 0;
	}
	
	public void ensureCapacity(int minCapacity){
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity){
			int newCapacity = oldCapacity*2;
			
			if(newCapacity < minCapacity)
				
				newCapacity = minCapacity;
			Queue=Arrays.copyOf(Queue,newCapacity);
		}
		}
	public Boolean isEmpty(){
		return(Front == size - 1 || Front > Rear);
	}
	public T Dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		
		T Objectout = (T) Queue[Front];
		Front = Front + 1;
		
		return Objectout;
	}
	public int getSize(){
		return Queue.length;
	}
}
