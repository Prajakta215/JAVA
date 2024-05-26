package com.day1.PS03;

import javax.swing.JOptionPane;

public class StudentsGradeMarks {
	public static void main(String[] args) {
	int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter Marks"));
	
	if(marks >= 60)
		System.out.println("Grade A");
	else if(marks >=45)
		System.out.println("Grade B");
	else if(marks >= 35)
		System.out.println("Grade C");
	else 
		System.out.println("Fail");
		
	}
}
	
