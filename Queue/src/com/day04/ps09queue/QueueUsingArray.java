package com.day04.ps09queue;

public class QueueUsingArray {
	int maxSize;
	int[] queueArray;
	int front;
	int rear;
	int size;
	
	public QueueUsingArray(int size) {
		this.maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is  full.");
		}else {
			rear = (rear +1)% maxSize;
			queueArray[rear] = item;
			size++;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is  empty.");
			return -1;
		}else {
			int dequeueItem = queueArray[front];
			front = (front +1)% maxSize;
			size--;
			return dequeueItem;
		}
	}
	
	public void display() {
		System.out.println("Elements in queue: ");
		int count = 0;
		int index = front;
		while(count < size) {
			System.out.println(queueArray[index]+ " ");
			index = (index + 1)%maxSize;
			count++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		queue.display();
		
		queue.dequeue();
		//int removedElement = queue.dequeue();
		System.out.println("After removing first element: ");
		queue.display();
	}
}

 