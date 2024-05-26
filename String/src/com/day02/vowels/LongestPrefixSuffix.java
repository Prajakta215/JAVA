package com.day02.vowels;

import java.util.Scanner;

//KMP (Knuth-Morris-Pratt) algorithm used to compute longest prefix which is also a suffix
public class LongestPrefixSuffix {

	static int longestPrefixSuffix(String str) {
		int n = str.length();
		int[] lps = new int[n];
		int len = 0;
		int i = 1;
		
		while(i<n) {
			if(str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}else {
				if(len != 0) {
					len = lps[len - 1];
				}else {
					lps[i] = 0;
					i++;
				}
			}
		}
		
		return lps[n - 1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.next();
		
//		String s = "aabcdaabc";
//		int length = longestPrefixSuffix(s);
		
		int length = longestPrefixSuffix(str);
		System.out.println("Length of the longest prefix which is also a suffix: " + length);

	}

}
