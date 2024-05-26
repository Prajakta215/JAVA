package com.day04.ps09queue;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class QueueUsingLinkedList {
	private Node front;
	private Node rear;

	
	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = newNode;
			rear=newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int dequeueItem = front.data;
			if(front == rear) {
				front = null;
				rear = null;
			}else {
				front = front.next;
			}
			return dequeueItem;
		}
	}
	
	
	public void display() {
		System.out.println("Elements in queue: ");
		Node current = front;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);
		
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("After removing two elements: ");
		queue.display();
		
	}
}
