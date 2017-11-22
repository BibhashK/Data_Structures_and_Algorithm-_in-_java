package com.ds;


 
public class QueueArray<T> {
Object[] ArrayQueue;
int Rear;
int Front;
int size;
	public QueueArray(int size) {
		this.size = size;
		ArrayQueue = new Object [this.size];
		Front = -1;
		Rear  = -1;
	}
	//--------------------------------------------------------------//
	public Boolean isFull(){
		return(Rear==size-1);
	}
	//--------------------------------------------------------------//
	public Boolean isEmpty(){
		return(Front==size-1|| Front>Rear);
	}
	//--------------------------------------------------------------//
	
	// ------------------insertion in array-------------------------//
	public void Queue(Object newItem){
		if(isFull()){
			System.out.println("queue is full");
			return;
		}
		Rear += 1;
		ArrayQueue[Rear] = newItem;
		if(Front ==-1)
			Front=0;
	}
	//==============Deletion==========================================//
	public T DeQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		T ObjectOut = (T) ArrayQueue[Front];
		Front =Front +1;
		return ObjectOut;
	}
}
