package com.day1.PS03;

import javax.swing.JOptionPane;
public class NumOfMonth {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number equal to or between 1-12 to display the month"));
		
		switch(num) {
		case 1:
			System.out.println("The name of month number 1 is January");
			break;
		case 2:
			System.out.println("The name of month number 2 is February");
			break;
		case 3:
			System.out.println("The name of month number 3 is March");
			break;
		case 4:
			System.out.println("The name of month number 4 is April");
			break;
		case 5:
			System.out.println("The name of month number 5 is May");
			break;
		case 6:
			System.out.println("The name of month number 6 is June");
			break;
		case 7:
			System.out.println("The name of month number 7 is July");
			break;
		case 8:
			System.out.println("The name of month number 8 is August");
			break;
		case 9:
			System.out.println("The name of month number 9 is September");
			break;
		case 10:
			System.out.println("The name of month number 10 is October");
			break;
		case 11:
			System.out.println("The name of month number 11 is November");
			break;
		case 12:
			System.out.println("The name of month number 12 is December");
			break;
			default:
				System.out.println("Invalid Input");
		
		}
	}
}
