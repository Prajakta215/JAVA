package com.day01session02.PS01;

import javax.swing.JOptionPane;

public class BingoChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 = JOptionPane.showInputDialog("Enter first number: ");
		
		int num1 = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog("Enter Second number: ");
		
		int num2 = Integer.parseInt(input2);
		
		
		int[] array = {7,25,5,8,17};
		
		boolean foundNum1 = false;
		boolean foundNum2 = false;
		
		for(int i=0;i<array.length;i++) {
			if(array[i] == num1) {
				foundNum1= true;
			}
			if(array[i] == num2) {
				foundNum2 = true;
			}
		}
		
		if(foundNum1 && foundNum2) {
			System.out.println("It's Bingo");
		}else {
			System.out.println("Not Found");
		}
	}

}
