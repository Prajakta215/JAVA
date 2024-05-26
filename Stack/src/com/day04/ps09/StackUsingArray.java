package com.day04.ps09;

public class StackUsingArray {
	
	int n;
	String[] arr;
	int top;
	
	StackUsingArray(int n){
		this.n = n;
		this.arr = new String[n];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull(){
		return (n-1 == top);
	}
	
	public void push(String data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else 
		{
			top++;
			arr[top] = data;
		}
	}
	
	public String pop()
	{
		if(isEmpty()) {
			System.out.println("satck is empty");
			return null;
		}else
		{
			String value = arr[top];
			top--;
			return value;
		}
	}
	
	public String peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}else {
			return arr[top];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray s= new StackUsingArray(5);
		//System.out.println(s.isEmpty());
		
		s.push("Hello");
		s.push("world");
		s.push("java");
		s.push("programming");
		
		System.out.println("After pushing 4 Elements: ");
		System.out.println("After a Pop: ");
		System.out.println(s.pop() + " ");
		System.out.println(s.pop() + " ");
		System.out.println(s.pop() + " ");
//		s.push("using");
//		s.push("java");
		
		while(!s.isEmpty()) {
			System.out.println(s.pop() + " ");
		}
		
		
	}

}
