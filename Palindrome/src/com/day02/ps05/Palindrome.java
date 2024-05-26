package com.day02.ps05;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		
		int length = input.length();
		System.out.println("Length of the string: " + length);
		
		String upperCaseString = input.toUpperCase();
		System.out.println("Uppercase string: " + upperCaseString);
		
		boolean isPalindrome = checkPalindrome(input);
		if(isPalindrome) {
			System.out.println("The string is a palindrome.");
		}else {
			System.out.println("The string is not a palindrome.");
		}
		sc.close();
	}

	private static boolean checkPalindrome(String str) {
		// TODO Auto-generated method stub
		int length = str.length();
		
		for(int i=0; i< length/2; i++) {
			if(str.charAt(i) != str.charAt(length-i-1)) {
				return false;
			}
		}
		
		return true;
	}

}
