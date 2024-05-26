package com.day1.PS03;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//int num = input.nextInt();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number between 1 to 7"));
		
		if(num==1)
			System.out.println("This is a Sunday");
		else if(num==2)
			System.out.println("This is a Monday");
		else if(num==3)
			System.out.println("This is a Tuesday");
		else if(num==4)
			System.out.println("This is a Wednesday");
		else if(num==5)
			System.out.println("This is a Thursday");
		else if(num==6)
			System.out.println("This is a Friday");
		else if(num==7)
			System.out.println("This is a Saturday");
		else
			System.out.println("Enter 1 to 7.....");
		
	}
}
