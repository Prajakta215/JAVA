package com.day04.ps09queue;

public class CircularQueue {
	private int maxSize;
	private int[] queueArr;
	private int front;
	private int rear;
	private int size;
	
	public CircularQueue(int size) {
		this.maxSize = size;
		queueArr = new int[maxSize];
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
			System.out.println("Queue is full.");
		}else {
			rear = (rear+1)%maxSize;
			queueArr[rear] = item;
			size++;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}else {
			int dequeueItem = queueArr[front];
			rear = (rear+1)%maxSize;
			size--;
			return dequeueItem;
		}
	}
	
	public void display() {
		System.out.println("Elements in circular queue: ");
		int count = 0;
		int index = front;
		while(count < size) {
			System.out.println(queueArr[index] + " ");
			index = (index + 1)%maxSize;
			count++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularQueue cqueue = new CircularQueue(5);
		cqueue.enqueue(14);
		cqueue.enqueue(13);
		cqueue.enqueue(22);
		cqueue.enqueue(-8);
		
		cqueue.display();
		
		cqueue.dequeue();
		System.out.println("After removing first element: ");
		cqueue.display();
		
	}
}
