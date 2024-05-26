package com.day02.vowels;

import java.util.ArrayList;
import java.util.List;

public class PatternMatching {

	
	static List<String> findMatchingStrings(String[] dictionary, String pattern){
		List<String> result = new ArrayList<>();
		
		for(String word : dictionary) {
			if(word.length() == pattern.length() && matchesPattern(word,pattern)) {
				result.add(word);
			}
		}
		
		return result;
		
	}
	private static boolean matchesPattern(String word, String pattern) {
		// TODO Auto-generated method stub
		for(int i=0;i < word.length();i++) {
			if(word.charAt(i) != pattern.charAt(i)) {
			return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dictionary = {"abb", "abc", "xyz", "xyy"};
		String pattern = "foo";
		
		List<String> matchingStrings = findMatchingStrings(dictionary, pattern);
		
		if(matchingStrings.isEmpty()) {
			System.out.println("No matching String found.");
		}else {
			System.out.println("Matching strings: ");
			for(String str: matchingStrings) {
				System.out.print(str + " ");
			}
		}
	}

}
