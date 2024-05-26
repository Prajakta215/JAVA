package com.day04.ps10;

import java.util.Scanner;

public class MergeSort {

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
		mergeSort(arr, 0, n-1);
		
		System.out.println("Sorted array: ");
		printArray(arr);
		
		sc.close();
	}

	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
			
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for(int i=0; i<n1; i++) {
			leftArr[i] = arr[low+i];
		}
		
		for(int j=0; j<n2; j++) {
			rightArr[j] = arr[mid+1+j];
		}
		
		int i=0, j=0, k=low;
		while(i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			}else {
				arr[k++] = rightArr[j++];
			}
		}
		
		while(i<n1) {
			arr[k++] = leftArr[i++];
		}
		
		while(j<n2) {
			arr[k++] = rightArr[j++];
		}
	}

}
