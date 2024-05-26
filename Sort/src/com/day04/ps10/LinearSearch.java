package com.day04.ps10;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of arrays: ");
		int numArr = sc.nextInt();
		
		for(int i=0; i<numArr; i++) {
			System.out.println("Enter the size of array " + (i+1) + ":");
			int size = sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the elements of array " + (i+1) + ":");
			for(int j=0; j<size;j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println("Enter the elements to search in array " + (i+1) + ":");
			int searchEle = sc.nextInt();
			if(LinearSearch(arr, searchEle)) {
				System.out.println("Element is present");
			}else {
				System.out.println("Element is Not present");
			}
		}
	}

	public static boolean LinearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int num : arr) {
			if(num == key) {
				return true;
			}
		}
		return false;
	}


}
