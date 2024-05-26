package com.day04.ps09;

class Node {
	
	double data;
	Node next;
	
	public Node(double data) {
		this.data = data;
		this.next = null;
	}

	public class StackUsingLinkedlist{
		Node top;
		
		public StackUsingLinkedlist() {
			this.top = null;
		}
		
		public boolean isEmpty() {
			return top == null;
		}
		
		public void push(double data) {
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
					
		}
		
		public double pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty.");
				return Double.NaN;
			}else {
				double poppedItem = top.data;
				top = top.next;
				return poppedItem;
			}
		}
		
		public void display() {
			Node current = top;
			System.out.println("The elements ofthe stack are: ");
			while(current != null) {
				System.out.println(current.data + " ");
				current = current.next;
			}
			System.out.println("null");
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StackUsingLinkedlist s = new StackUsingLinkedlist();
			s.push(10.0);
			s.push(20.0);
			s.push(30.0);
			s.push(40.0);
			
			s.display();
			
			double popped1 = s.pop();
			double popped2 = s.pop();
			
			System.out.println("After popping twice: ");
			s.display();
		}
	}
	
	

	
	

}
