package com.ds;

// for queue we use doubly linked list
public class QueueLinkedList<T> {
	NodeD Rear;
	NodeD Front;
	int size;
	public QueueLinkedList(int size) {
		Rear = null;
		this.size = size;
		Front = null;
	}
	//insertion
public void Queue(Object value){ // adding elements to queue
	NodeD newNode = new NodeD(value,null,null);
	if(Rear==null){
		Rear = newNode;
		Front = newNode;
	}
	else{
		newNode.next = null; // since the queue is empty
		newNode.previous =Rear; // since the new value is assigned 
		Rear.next = newNode; //
	}
}
//deletion
public T Dequeue(){
	if(Rear==null || Front == null){
		System.out.println("Queue is empty");
		return null;
	}
	T value =(T)Front.value;
	Front = Front.next;
	if(Front !=null)
	Front.previous = null;
	return value;
}
public int getsize(){
	return size;
}

}




