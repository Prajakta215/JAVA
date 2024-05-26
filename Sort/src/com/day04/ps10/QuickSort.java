package com.day04.ps10;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr, 0, n-1);
		
		System.out.println("Sorted array: ");
		printArray(arr);
		
		sc.close();
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i + 1;
		
	}


	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex -1);
			quickSort(arr, pivotIndex +1, high);
		}
	}
	
	
}
