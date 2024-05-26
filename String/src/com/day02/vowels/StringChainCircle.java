package com.day02.vowels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringChainCircle {

	static boolean circle(List<String> strings) {
//		Map<Character, List<String>> startChar = new HashMap();
//		Map<String, Integer> endChar = new HashMap();
		
		
		Set<Character> startChar = new HashSet<>();
		Set<Character> endChar = new HashSet<>();
		for(String str : strings) {
			char firstChar = str.charAt(0);
			char secondChar = str.charAt(str.length() - 1);
//			startChar.putIfAbsent(firstChar, new ArrayList<>());
//			startChar.get(firstChar).add(str);
//			endChar.put(str, 0);
			startChar.add(firstChar);
			endChar.add(secondChar);
		}
		
		for(String str : strings) {
			char firstChar = str.charAt(0);
			char secondChar = str.charAt(str.length() - 1);
			if(startChar.contains(secondChar) && endChar.contains(firstChar)){
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> strings = new ArrayList<>();
		for(int i=0; i < n; i++) {
			strings.add(sc.next());
		}
		sc.close();
		
		boolean result = circle(strings);
		if(result) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}
	}
}

