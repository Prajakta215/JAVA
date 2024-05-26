package com.day1.PS03;

import javax.swing.JOptionPane;

public class DisplayPattern {
	public static void main(String[] args) {
		int i,j;
		
		//System.out.println("Input number of n: ");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.println(i);
			}
			System.out.println("");
		}
	}
}
