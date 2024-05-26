package com.day02.vowels;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int totalVowels = countVowels(input);
		
		int lastNVowels = countLastVowels(input, n);
		
		System.out.println("Vowels in the string : ");
		printVowels(input);
		
		if(lastNVowels > totalVowels) {
			System.out.println("Mismatch in vowels count");
		}else {
			System.out.println("Last " + n + " vowels count: " + lastNVowels);
		}
		
		
		sc.close();
	}

	private static void printVowels(String input) {
		// TODO Auto-generated method stub
		String vowels = "aeouiAEOUI";
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(vowels.indexOf(ch) != -1) {
				System.out.println(ch + " ");
			}
		}
		
	}

	private static int countLastVowels(String input, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		String vowels = "aeouiAEOUI";
		
		for(int i = input.length() - 1; i>= 0 && n>0; i--) {
			if(vowels.indexOf(input.charAt(i)) != -1) {
				count++;
				n--;
			}
		}
		return count;
	}

	private static int countVowels(String input) {
		// TODO Auto-generated method stub
		int count = 0;
		String vowels = "aeouiAEOUI";
		for(int i=0; i<input.length(); i++) {
			if(vowels.indexOf(input.charAt(i)) != -1) {
				count++;
			}
		}
				
		return count;
	}

	
}
