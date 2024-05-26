package com.day3s1.collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		
		list.add("John");
		list.add("Paul");
		list.add("Henary");
		list.add("Mary");
		list.add("Ronaldo");
		
		System.out.println(list);
		System.out.println(list.contains("Henary"));
		
	}

}
