package com.day01session02.PS02;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,4,5,6,4,5,7,3,2,3,4,7,1,2,3,0,0,0};
		
		//compute sum of element
		int sum =0;
		for(int i=0; i< 15; i++) {
			sum += A[i];
		}
		A[15] = sum;
		
		
	
		//compute the average of all numbers
		double average = (double) sum / 15;
		A[16] =(int) average;
		
		//Identify the smallest value from the array
		int smallest = A[0];
		for(int i=1;i< A.length; i++) {
			if(A[i] < smallest) {
				smallest = A[i];
			}
		}
		A[17] = smallest;
		
		//output
		for(int i = 0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}

}
