package com.day1.PS03;

import javax.swing.JOptionPane;

public class FactorialNumber {
	public static void main(String[] args) {
		int i,fact=1;
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
		
		for(i=1;i<=number;i++) {
			fact = fact*i;
			
		}
		System.out.println("Factorial of " +number+ " is: "+fact);
	}
}
