package com.day02.vowels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequencesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "abc";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		List<String> subsequences = findSubsequences(str);
		
		for(String subsequence : subsequences) {
			System.out.println(subsequence);
		}
		
		sc.close();
	}

	private static List<String> findSubsequences(String str) {
		// TODO Auto-generated method stub
		List<String> subsequences = new ArrayList<>();
		generateSubsequences(str,0,"",subsequences);
		return subsequences;
	}

	private static void generateSubsequences(String str, int i, String current, List<String> subsequences) {
		// TODO Auto-generated method stub
		if(i == str.length()) {
			subsequences.add(current);
			return;
		}
		
		generateSubsequences(str, i + 1, current + str.charAt(i), subsequences);
		
		generateSubsequences(str, i+1, current, subsequences);
	}

}
